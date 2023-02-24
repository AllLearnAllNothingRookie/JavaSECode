package study.polymorphic.study.dynamicbinding;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 16:21
 */
public class A {
    public int i = 10;
    public int sum(){

        return getI() +  i;
    }
    public int sum1(){
        return  i + 10;
    }
    public int getI(){
        return  i;
    }
}
