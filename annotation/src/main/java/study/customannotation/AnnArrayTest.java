package study.customannotation;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 10:59
 */
public class AnnArrayTest {
    @AnnArray({@MyAnn("rookie"),@MyAnn("tom")})
    public void method(){
        System.out.println("hello method");
    }

    /**
     * 等价于 @AnnArray({@MyAnn("jack"), @MyAnn("jerry")})
     */
    @MyAnn("jack")
    @MyAnn("jerry")
    public void fun(){
        System.out.println("hello fun");
    }
}
