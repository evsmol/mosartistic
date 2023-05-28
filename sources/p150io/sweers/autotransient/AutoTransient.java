package p150io.sweers.autotransient;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* renamed from: io.sweers.autotransient.AutoTransient */
public @interface AutoTransient {
}
