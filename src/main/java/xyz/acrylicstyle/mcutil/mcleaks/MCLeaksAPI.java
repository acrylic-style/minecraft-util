package xyz.acrylicstyle.mcutil.mcleaks;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import util.RESTAPI;
import util.promise.Promise;
import xyz.acrylicstyle.mcutil.mcleaks.results.MCLeaksRedeemResult;

public class MCLeaksAPI {
    /**
     * Redeems MCLeaks Alt Token and returns a result. {@link MCLeaksRedeemResult} inside {@link Result} may be null
     * if not successful.
     * @param token the alt token to redeem
     * @return the result
     */
    @NotNull
    public static Promise<Result<@Nullable MCLeaksRedeemResult>> redeem(@NotNull String token) {
        return new RESTAPI("https://auth.mcleaks.net/v1/redeem", "POST", new RESTAPI.BodyBuilder().setJSON(new JSONObject().put("token", token)).build())
                .call()
                .then(RESTAPI.Response::getResponse)
                .then(obj ->
                        new Result<>(
                                obj.getBoolean("success"),
                                !obj.getBoolean("success")
                                        ? null
                                        : new MCLeaksRedeemResult(obj.getJSONObject("result").getString("mcname"), obj.getJSONObject("result").getString("session")),
                                obj.getBoolean("success")
                                        ? null
                                        : new MCLeaksErrorResult(obj.getString("errorMessage"))
                        )
                );
    }

    public static final class Result<E> {
        private final boolean success;
        private final E result;
        private final MCLeaksErrorResult error;

        @Contract(pure = true)
        public Result(boolean success, E result, @Nullable MCLeaksErrorResult error) {
            this.success = success;
            this.result = result;
            this.error = error;
        }

        @Contract(pure = true)
        public boolean isSuccess() { return success; }

        @Contract(pure = true)
        public E getResult() { return result; }

        @Contract(pure = true)
        public MCLeaksErrorResult getError() { return error; }
    }

    public static final class MCLeaksErrorResult {
        private final String errorMessage;

        @Contract(pure = true)
        public MCLeaksErrorResult(String errorMessage) { this.errorMessage = errorMessage; }

        @Contract(pure = true)
        public String getErrorMessage() { return errorMessage; }
    }
}
