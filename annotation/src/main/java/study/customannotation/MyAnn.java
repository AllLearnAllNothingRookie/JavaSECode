package study.customannotation;


import java.lang.annotation.Repeatable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 10:54
 */
@Repeatable(AnnArray.class)
public @interface MyAnn {
    String value();
}
