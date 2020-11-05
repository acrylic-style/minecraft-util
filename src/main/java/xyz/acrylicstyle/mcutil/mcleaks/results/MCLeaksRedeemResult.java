package xyz.acrylicstyle.mcutil.mcleaks.results;

import org.jetbrains.annotations.NotNull;

public final class MCLeaksRedeemResult {
    @NotNull private final String name;
    @NotNull private final String sessionId;

    public MCLeaksRedeemResult(@NotNull String name, @NotNull String sessionId) {
        this.name = name;
        this.sessionId = sessionId;
    }

    @NotNull
    public final String getName() { return name; }

    @NotNull
    public final String getSessionId() { return sessionId; }
}
