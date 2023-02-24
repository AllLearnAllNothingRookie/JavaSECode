package study.polymorphic.study.dynamicbinding;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 16:22
 */
public class B extends A{
    public int i = 20;
    /*public int sum(){
        return getI() +  i;
    }*/
   /* public int sum1(){
        return  i + 10;
    }*/
    public int getI(){
        return  i;
    }
}
