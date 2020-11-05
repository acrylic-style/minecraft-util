package xyz.acrylicstyle.mcutil.mojang.results;

import org.jetbrains.annotations.NotNull;

public enum ChangeNameResult {
    /**
     * Name is unavailable (Either taken, has not become available or blocked by Mojang)
     */
    UNAVAILABLE,

    /**
     * Password incorrect or Bearer token expired / invalid
     */
    UNAUTHORIZED,

    /**
     * Account might not have Minecraft purchased
     */
    FORBIDDEN,

    /**
     * API lagged out and could not respond
     */
    TIMED_OUT,

    /**
     * Name was changed successfully.
     */
    SUCCESS,
    ;

    @NotNull
    public static ChangeNameResult getByStatusCode(int statusCode) {
        switch (statusCode) {
            case 400: return UNAVAILABLE;
            case 401: return UNAUTHORIZED;
            case 403: return FORBIDDEN;
            case 504: return TIMED_OUT;
            case 204: return SUCCESS;
            default: throw new RuntimeException("Missing mapping for " + statusCode);
        }
    }
}
