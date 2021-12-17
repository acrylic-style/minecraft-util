package xyz.acrylicstyle.mcutil.bungeecord;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.reflect.Ref;
import util.reflect.RefClass;
import xyz.acrylicstyle.mcutil.common.PlayerProfile;

import java.util.UUID;

public final class BungeeCordAPI {
    public static final boolean available;
    public static final RefClass<?> CLASS;
    public static final Object instance;

    static {
        boolean found;
        RefClass<?> clazz;
        Object inst;
        try {
            clazz = Ref.getClass(Class.forName("net.md_5.bungee.api.ProxyServer"));
            found = true;
            inst = clazz.getMethod("getInstance").invoke(null);
        } catch (ClassNotFoundException e) {
            clazz = null;
            found = false;
            inst = null;
        }
        available = found;
        CLASS = clazz;
        instance = inst;
    }

    @Nullable
    public static PlayerProfile getPlayer(@NotNull UUID uuid) {
        if (!available) return null;
        Object o = CLASS.getMethod("getPlayer", UUID.class).invokeObj(instance, uuid);
        if (o == null) return null;
        return new ProxiedPlayer(o);
    }

    @Nullable
    public static PlayerProfile getPlayer(@NotNull String name) {
        if (!available) return null;
        Object o = CLASS.getMethod("getPlayer", String.class).invokeObj(instance, name);
        if (o == null) return null;
        return new ProxiedPlayer(o);
    }
}
