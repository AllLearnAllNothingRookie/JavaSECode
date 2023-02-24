package study.polymorphic.study.methodpolymorphism;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 12:59
 */
public class A extends  B{
    public int sum(int n1,int n2){
        return  n1 + n2;
    }
    public int sum(int n1,int n2,int n3){
        return  n1 + n2 + n3;
    }
    public void say(){
        System.out.println("A say()方法被调用");
    }
}
