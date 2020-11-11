package xyz.acrylicstyle.mcutil.mojang;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface GameProfile {
    @NotNull
    UUID getUniqueId();

    @NotNull
    String getName();
}
