package xyz.acrylicstyle.mcutil.lang;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;

@SuppressWarnings("unused")
public final class ValueTypes<T> {
    public static final ValueTypes<double[]> AL_VERSION = new ValueTypes<>(AlVersion.class);
    public static final ValueTypes<String> CAVES_AND_CLIFFS_DATA_PACK = new ValueTypes<>(CavesAndCliffsDataPack.class);
    public static final ValueTypes<String[]> CLIENT_JAR = new ValueTypes<>(ClientJar.class);
    public static final ValueTypes<String[]> SERVER_JAR = new ValueTypes<>(ServerJar.class);
    public static final ValueTypes<String[]> CLIENT_MAPPING = new ValueTypes<>(ClientMapping.class);
    public static final ValueTypes<String[]> SERVER_MAPPING = new ValueTypes<>(ServerMapping.class);
    public static final ValueTypes<String[]> SERVER_ZIP = new ValueTypes<>(ServerZip.class);
    public static final ValueTypes<String[]> SERVER_EXE = new ValueTypes<>(ServerExe.class);
    public static final ValueTypes<MCVersion> RELEASE_CANDIDATE_FOR = new ValueTypes<>(ReleaseCandidateFor.class);
    public static final ValueTypes<MCVersion> PRE_RELEASE_FOR = new ValueTypes<>(PrereleaseFor.class);
    public static final ValueTypes<MCVersion> SNAPSHOT_FOR = new ValueTypes<>(SnapshotFor.class);
    public static final ValueTypes<MCVersion> CORRESPONDING_VERSION = new ValueTypes<>(CorrespondingVersion.class);

    private final Class<? extends Annotation> annotation;

    @Contract(pure = true)
    private ValueTypes(@NotNull Class<? extends Annotation> annotation) {
        this.annotation = annotation;
    }

    @Contract(pure = true)
    @NotNull
    public Class<? extends Annotation> getAnnotationClass() {
        return annotation;
    }
}
