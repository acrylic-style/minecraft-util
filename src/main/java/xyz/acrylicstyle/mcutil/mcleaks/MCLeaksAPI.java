package xyz.acrylicstyle.mcutil.mcleaks;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import util.RESTAPI;
import util.promise.Promise;
import xyz.acrylicstyle.mcutil.mcleaks.results.MCLeaksRedeemResult;

public class MCLeaksAPI {
    @NotNull
    public static Promise<Result<MCLeaksRedeemResult>> redeem(@NotNull String token) {
        return new RESTAPI("https://auth.mcleaks.net/v1/redeem", "POST", new RESTAPI.BodyBuilder().setJSON(new JSONObject().put("token", token)).build())
                .call()
                .then(RESTAPI.Response::getResponse)
                .then(obj -> new Result<>(obj.getBoolean("success"), new MCLeaksRedeemResult(obj.getJSONObject("result").getString("mcname"), obj.getJSONObject("result").getString("session"))));
    }

    public static final class Result<E> {
        private final boolean success;
        private final E result;

        @Contract(pure = true)
        public Result(boolean success, E result) {
            this.success = success;
            this.result = result;
        }

        @Contract(pure = true)
        public boolean isSuccess() { return success; }

        @Contract(pure = true)
        public E getResult() { return result; }
    }
}
