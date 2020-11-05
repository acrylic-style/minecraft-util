package xyz.acrylicstyle.mcutil.common;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public interface PlayerProfile {
    @NotNull
    String getName();

    @NotNull
    UUID getUniqueId();
}
