package xyz.acrylicstyle.mcutil.mojang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import util.UUIDUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GameProfile {
    @NotNull public final UUID id;
    @NotNull public final String name;
    @NotNull public final Property[] properties;

    public GameProfile(@NotNull UUID id, @NotNull String name, @NotNull Property[] properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    @Contract(value = "_ -> new", pure = true)
    @NotNull
    public static GameProfile parse(@NotNull JSONObject json) {
        UUID id = UUIDUtil.uuidFromStringWithoutDashes(json.getString("id"));
        String name = json.getString("name");
        List<Property> properties = new ArrayList<>();
        json.getJSONArray("properties").forEach(o -> {
            if (o instanceof JSONObject) {
                properties.add(Property.parse((JSONObject) o));
            }
        });
        return new GameProfile(id, name, properties.toArray(new Property[0]));
    }
}
