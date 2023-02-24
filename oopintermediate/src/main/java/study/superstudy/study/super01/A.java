package study.superstudy.study.super01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/23 20:27
 *   todo: super代表父类的引用，用于访问父类的属性、方法和构造器
 *        1.super可以访问父类的属性，但是不能访问父类的私有属性
 *               语法: super.属性名;
 *        2.super可以访问父类的方法，但不能访问父类的私有方法
 *                语法:super.方法名(参数列表);
 *        3.super可以访问父类构造器,但不能访问父类私有构造器
 *                语法:super(参数列表);
 *              必须要要在构造器中使用，并且必须为构造器的第一行
 */
public class A {
    //四个属性
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private  int n4 = 400;
    //四个构造器
    public A(){
        System.out.println("公开无参");
    }
    protected  A(int n1){
        System.out.println("保护");
    }
    A(int n1,int n2){
        System.out.println("默认");
    }
    private A(int n1,int n2,int n3){
        System.out.println("私有");
    }
    //四个方法
    public void test01(){
        System.out.println("test01");
    }
    protected void test02(){
        System.out.println("test02");
    }
    void  test03(){
        System.out.println("test03");
    }
    private void test04(){
        System.out.println("test04");
    }
}
