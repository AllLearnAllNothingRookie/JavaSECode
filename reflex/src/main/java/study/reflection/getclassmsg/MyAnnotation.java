package study.reflection.getclassmsg;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 15:56
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "尚硅谷";
}
