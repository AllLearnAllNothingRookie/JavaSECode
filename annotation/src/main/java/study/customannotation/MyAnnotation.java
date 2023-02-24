package study.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 9:41
 *
 */
@Target({ElementType.METHOD,ElementType.TYPE_USE,ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value() default "alanrookie";
}
