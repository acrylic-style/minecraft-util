package xyz.acrylicstyle.mcutil.mcleaks.results;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class MCLeaksRedeemResult {
    @NotNull private final String name;
    @NotNull private final String sessionId;

    @Contract(pure = true)
    public MCLeaksRedeemResult(@NotNull String name, @NotNull String sessionId) {
        this.name = name;
        this.sessionId = sessionId;
    }

    @Contract(pure = true)
    @NotNull
    public final String getName() { return name; }

    @Contract(pure = true)
    @NotNull
    public final String getSessionId() { return sessionId; }
}
