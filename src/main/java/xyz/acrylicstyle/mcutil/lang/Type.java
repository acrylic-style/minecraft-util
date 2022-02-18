package xyz.acrylicstyle.mcutil.lang;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Type {
    Types value();

    enum Types {
        /**
         * Usually used for experimental snapshots and <i>not</i> available in the launcher.
         */
        PENDING,
        /**
         * Used for snapshots/pre-releases/release-candidates and available in the launcher.
         */
        SNAPSHOT,
        /**
         * Used for full releases (such as 1.18.1).
         */
        RELEASE,
    }
}
