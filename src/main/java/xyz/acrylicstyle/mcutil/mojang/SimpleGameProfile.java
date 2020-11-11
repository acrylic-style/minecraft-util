package xyz.acrylicstyle.mcutil.mojang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import util.UUIDUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class SimpleGameProfile implements GameProfile {
    @NotNull public final UUID id;
    @NotNull public final String name;
    @NotNull public final Property[] properties;

    public SimpleGameProfile(@NotNull UUID id, @NotNull String name, @NotNull Property[] properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    @Contract(value = "_ -> new", pure = true)
    @NotNull
    public static SimpleGameProfile parse(@NotNull JSONObject json) {
        UUID id = UUIDUtil.uuidFromStringWithoutDashes(json.getString("id"));
        String name = json.getString("name");
        List<Property> properties = new ArrayList<>();
        json.getJSONArray("properties").forEach(o -> {
            if (o instanceof JSONObject) {
                properties.add(Property.parse((JSONObject) o));
            }
        });
        return new SimpleGameProfile(id, name, properties.toArray(new Property[0]));
    }

    @Override
    public int hashCode() {
        int i = this.id.hashCode();
        i = 31 * i + this.name.hashCode();
        return i;
    }

    @Override
    public String toString() {
        return "GameProfile{" + "id=" + id +
                ", name='" + name + '\'' +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleGameProfile that = (SimpleGameProfile) o;
        if (!id.equals(that.id)) return false;
        return name.equals(that.name);
    }

    @NotNull
    public Property[] getProperties() { return properties; }

    @Override
    @NotNull
    public UUID getUniqueId() { return id; }

    @Override
    @NotNull
    public String getName() { return name; }

    @NotNull
    public UUID getId() { return id; }
}
