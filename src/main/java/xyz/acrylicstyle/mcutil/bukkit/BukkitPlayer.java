package xyz.acrylicstyle.mcutil.bukkit;

import org.jetbrains.annotations.NotNull;
import util.reflect.Ref;
import util.reflect.RefClass;
import xyz.acrylicstyle.mcutil.common.PlayerProfile;

import java.util.UUID;

@SuppressWarnings("deprecation")
public final class BukkitPlayer implements PlayerProfile {
    public static final RefClass<?> CLASS = Ref.forName("org.bukkit.entity.Player");

    private final Object player;

    public BukkitPlayer(Object player) { this.player = player; }

    @NotNull
    @Override
    public final UUID getUniqueId() { return (UUID) CLASS.getMethod("getUniqueId").invokeObj(player); }

    @NotNull
    @Override
    public final String getName() { return (String) CLASS.getMethod("getName").invokeObj(player); }
}
