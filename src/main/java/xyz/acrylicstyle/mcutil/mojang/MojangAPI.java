package xyz.acrylicstyle.mcutil.mojang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import util.Collection;
import util.CollectionList;
import util.RESTAPI;
import util.StringCollection;
import util.UUIDUtil;
import util.promise.Promise;
import util.ref.DataCache;
import xyz.acrylicstyle.mcutil.bukkit.BukkitAPI;
import xyz.acrylicstyle.mcutil.common.SimplePlayerProfile;
import xyz.acrylicstyle.mcutil.bungeecord.BungeeCordAPI;
import xyz.acrylicstyle.mcutil.common.PlayerProfile;
import xyz.acrylicstyle.mcutil.mojang.results.ChangeNameResult;

import java.util.UUID;

public class MojangAPI {
    private static final Collection<UUID, DataCache<SimpleGameProfile>> gameProfileCache = new Collection<>();
    private static final Collection<UUID, DataCache<PlayerProfile>> playerProfileCacheByUUID = new Collection<>();
    private static final StringCollection<DataCache<PlayerProfile>> playerProfileCacheByName = new StringCollection<>();

    /**
     * Fetches GameProfile of uuid. The result will be cached for 10 minutes.
     * @param uuid the uuid
     * @return the game profile
     */
    // cached
    @Contract(value = "_ -> new", pure = true)
    @NotNull
    public static Promise<@NotNull SimpleGameProfile> getGameProfile(@NotNull UUID uuid) {
        if (gameProfileCache.containsKey(uuid)) {
            DataCache<SimpleGameProfile> cache = gameProfileCache.get(uuid);
            SimpleGameProfile gp = cache.get();
            if (gp != null) return Promise.of(gp);
        }
        return new RESTAPI(String.format("https://sessionserver.mojang.com/session/minecraft/profile/%s?unsigned=false", uuid.toString().replaceAll("-", ""))).call()
                .then(response -> SimpleGameProfile.parse(response.getResponse()))
                .then(gp -> {
                    gameProfileCache.add(uuid, new DataCache<>(gp, System.currentTimeMillis() + 1000 * 60 * 10)); // 10 minutes of cache
                    return gp;
                });
    }

    /**
     * Fetches name change history. The result will not be cached. Last entry of the list contains the latest name
     * and the uuid.
     * @param uuid the uuid
     * @return their name changes
     */
    // not cached
    @NotNull
    public static Promise<@NotNull CollectionList<?, NameHistory>> getNameChanges(@NotNull UUID uuid) {
        return new RESTAPI("https://api.mojang.com/user/profiles/" + uuid.toString().replaceAll("-", "") + "/names").call(JSONArray.class)
                .then(res -> res.getResponseCode() != 200 ? null : res.getResponse())
                .<CollectionList<?, NameHistory>>then(array -> {
                    if (array == null) return CollectionList.of();
                    CollectionList<?, NameHistory> histories = new CollectionList<>();
                    array.forEach(o -> {
                        JSONObject obj = (JSONObject) o;
                        histories.add(new NameHistory(obj.getString("name"), obj.has("changedToAt") ? obj.getLong("changedToAt") : null));
                    });
                    return histories;
                });
    }

    /**
     * Fetches profile of the player. The result will be cached for 10 minutes. Bukkit/BungeeCord API will not be
     * used on this method. (This method is guaranteed to return the latest profile unless cached.) If you need
     * this method to be fast, you may want to use {@link #getPlayerProfile(String, boolean)} instead.
     * @param name the player name to find
     * @return the player profile
     */
    // cached
    @NotNull
    public static Promise<@Nullable PlayerProfile> getPlayerProfile(@NotNull String name) {
        return getPlayerProfile(name, false); // using bukkit/bungeecord api is unreliable when the player is nicked
    }

    /**
     * Fetches profile of the player. The result will be cached for 10 minutes. Bukkit/BungeeCord API may be
     * used if you've specified to use API. When using Bukkit/BungeeCord API, the method call will be faster, but
     * it might return unreliable result when the player is changed via internal method / field.
     * @param name the player name to find
     * @param useAPI whether to use Bukkit/BungeeCord API when available
     * @return the player profile
     */
    // cached
    @NotNull
    public static Promise<@Nullable PlayerProfile> getPlayerProfile(@NotNull String name, boolean useAPI) {
        if (playerProfileCacheByName.containsKey(name)) {
            PlayerProfile cache = playerProfileCacheByName.get(name).get();
            if (cache != null) return Promise.of(cache);
        }
        if (useAPI) {
            PlayerProfile player;
            player = BukkitAPI.getPlayer(name);
            if (player == null) player = BungeeCordAPI.getPlayer(name);
            if (player != null) {
                playerProfileCacheByName.add(name, new DataCache<>(player, System.currentTimeMillis() + 1000 * 60 * 10));
                return Promise.of(player);
            }
        }
        return new RESTAPI("https://api.mojang.com/users/profiles/minecraft/" + name).call()
                .then(response -> {
                    if (response.getResponseCode() != 200) return null;
                    return response.getResponse();
                })
                .then(obj -> {
                    if (obj == null) return null;
                    PlayerProfile profile = new SimplePlayerProfile(obj.getString("name"), UUIDUtil.uuidFromStringWithoutDashes(obj.getString("id")));
                    playerProfileCacheByName.add(name, new DataCache<>(profile, System.currentTimeMillis() + 1000 * 60 * 10));
                    return profile;
                });
    }

    /**
     * Fetches the name of the player. The result will be cached for 10 minutes. Bukkit/BungeeCord API will not
     * be used. If you need this method to be fast, you may want to use {@link #getPlayerProfile(String, boolean)}
     * instead.
     * @param uuid the player's uuid to get name.
     * @return player name
     */
    // cached
    @NotNull
    public static Promise<@NotNull String> getName(@NotNull UUID uuid) { return getName(uuid, false); }

    /**
     * Fetches the name of the player. The result will be cached for 10 minutes. Bukkit/BungeeCord API may be
     * used if you've specified to use API. When using Bukkit/BungeeCord API, the method call will be faster, but
     * it might return unreliable result when the player is changed via internal method / field.
     * @param uuid the player's uuid to get name.
     * @param useAPI whether to use Bukkit/BungeeCord API when available
     * @return player name
     */
    // cached
    @NotNull
    public static Promise<@NotNull String> getName(@NotNull UUID uuid, boolean useAPI) {
        if (playerProfileCacheByUUID.containsKey(uuid)) {
            PlayerProfile cache = playerProfileCacheByUUID.get(uuid).get();
            if (cache != null) return Promise.of(cache.getName());
        }
        if (useAPI) {
            PlayerProfile player;
            player = BukkitAPI.getPlayer(uuid);
            if (player == null) BungeeCordAPI.getPlayer(uuid);
            if (player != null) {
                playerProfileCacheByUUID.add(uuid, new DataCache<>(player, System.currentTimeMillis() + 1000 * 60 * 10));
                return Promise.of(player.getName());
            }
        }
        return getNameChanges(uuid)
                .then(CollectionList::last)
                .then(history -> new SimplePlayerProfile(history.getName(), uuid))
                .then(profile -> {
                    playerProfileCacheByUUID.add(uuid, new DataCache<>(profile, System.currentTimeMillis() + 1000 * 60 * 10));
                    return profile.getName();
                });
    }

    /**
     * Fetches the unique id of the player.
     * @param name the name to find
     * @return player's uuid
     */
    // cached
    @NotNull
    public static Promise<@NotNull UUID> getUniqueId(@NotNull String name) {
        return getPlayerProfile(name).then(PlayerProfile::getUniqueId);
    }

    // ----- POST Actions

    /**
     * Set the name for the account with the UUID.
     * @param accessToken access token
     * @param profile the profile that contains new name
     * @param password the password of the account.
     * @return the promise that contains a result of this request
     */
    @NotNull
    public static Promise<ChangeNameResult> changeName(@NotNull String accessToken, @NotNull PlayerProfile profile, @NotNull String password) {
        return new RESTAPI("https://api.mojang.com/user/profile/" + profile.getUniqueId().toString().replaceAll("-", ""), "POST", new RESTAPI.BodyBuilder().setJSON(new JSONObject().put("name", profile.getName()).put("password", password)).addRequestProperty("Authorization", "Bearer " + accessToken).build())
                .call(String.class)
                .then(RESTAPI.Response::getResponseCode)
                .then(ChangeNameResult::getByStatusCode);
    }
}
