package xyz.acrylicstyle.mcutil.common;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class SimplePlayerProfile implements PlayerProfile {
    @NotNull private final String name;
    @NotNull private final UUID uuid;

    public SimplePlayerProfile(@NotNull String name, @NotNull UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    @NotNull
    @Override
    public String getName() { return name; }

    @NotNull
    @Override
    public UUID getUniqueId() { return uuid; }

    @Override
    public String toString() {
        return "PlayerProfile{" + "name='" + name + '\'' +
                ", uuid=" + uuid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimplePlayerProfile that = (SimplePlayerProfile) o;
        if (!name.equals(that.name)) return false;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + uuid.hashCode();
        return result;
    }
}
