package xyz.acrylicstyle.mcutil.mojang;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public final class NameHistory {
    @NotNull
    private final String name;
    @Nullable
    private final Long changedToAt;

    public NameHistory(@NotNull String name, @Nullable Long changedToAt) {
        this.name = name;
        this.changedToAt = changedToAt;
    }

    @NotNull
    public String getName() { return name; }

    @Nullable
    public Long getChangedToAt() { return changedToAt; }

    @Override
    public String toString() {
        return "NameHistory{" + "name='" + name + '\'' +
                ", changedToAt=" + changedToAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameHistory that = (NameHistory) o;
        if (!name.equals(that.name)) return false;
        return Objects.equals(changedToAt, that.changedToAt);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (changedToAt != null ? changedToAt.hashCode() : 0);
        return result;
    }
}
