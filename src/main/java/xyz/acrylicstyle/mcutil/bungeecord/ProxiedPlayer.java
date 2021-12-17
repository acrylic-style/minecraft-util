package xyz.acrylicstyle.mcutil.bungeecord;

import org.jetbrains.annotations.NotNull;
import util.reflect.Ref;
import util.reflect.RefClass;
import xyz.acrylicstyle.mcutil.common.PlayerProfile;

import java.util.UUID;

public final class ProxiedPlayer implements PlayerProfile {
    public static final RefClass<?> CLASS = Ref.forName("net.md_5.bungee.api.connection.ProxiedPlayer");

    private final Object player;

    public ProxiedPlayer(Object player) { this.player = player; }

    @NotNull
    @Override
    public UUID getUniqueId() { return (UUID) CLASS.getMethod("getUniqueId").invokeObj(player); }

    @NotNull
    @Override
    public String getName() { return (String) CLASS.getMethod("getName").invokeObj(player); }
}
