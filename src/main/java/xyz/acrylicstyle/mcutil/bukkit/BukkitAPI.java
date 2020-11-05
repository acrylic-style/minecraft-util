package xyz.acrylicstyle.mcutil.bukkit;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.reflect.Ref;
import util.reflect.RefClass;
import xyz.acrylicstyle.mcutil.common.PlayerProfile;

import java.util.UUID;

public final class BukkitAPI {
    public static final boolean available;
    public static final RefClass<?> CLASS;

    static {
        boolean found;
        RefClass<?> clazz;
        try {
            clazz = Ref.getClass(Class.forName("org.bukkit.Bukkit"));
            found = true;
        } catch (ClassNotFoundException e) {
            clazz = null;
            found = false;
        }
        available = found;
        CLASS = clazz;
    }

    @Nullable
    public static PlayerProfile getPlayer(@NotNull UUID uuid) {
        if (!available) return null;
        Object o = CLASS.getMethod("getPlayer", UUID.class).invoke(null, uuid);
        if (o == null) return null;
        return new BukkitPlayer(o);
    }

    @Nullable
    public static PlayerProfile getPlayer(@NotNull String name) {
        if (!available) return null;
        Object o = CLASS.getMethod("getPlayerExact", String.class).invoke(null, name);
        if (o == null) return null;
        return new BukkitPlayer(o);
    }
}
