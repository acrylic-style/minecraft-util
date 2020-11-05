package xyz.acrylicstyle.mcutil.mojang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class Property {
    @NotNull public final String name;
    @NotNull public final String value;
    @Nullable public final String signature;

    public Property(@NotNull String name, @NotNull String value) { this(name, value, null); }

    public Property(@NotNull String name, @NotNull String value, @Nullable String signature) {
        this.name = name;
        this.value = value;
        this.signature = signature;
    }

    @Contract(value = "_, _, _ -> new", pure = true)
    @NotNull
    public Property swap(@NotNull String name, @NotNull String value, @Nullable String signature) {
        return new Property(name, value, signature);
    }

    @Contract(value = "_ -> new", pure = true)
    @NotNull
    public static Property parse(@NotNull JSONObject json) {
        String name = json.getString("name");
        String value = json.getString("value");
        String signature = json.has("signature") ? json.getString("signature") : null;
        return new Property(name, value, signature);
    }
}
