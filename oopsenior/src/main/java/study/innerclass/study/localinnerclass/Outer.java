package study.innerclass.study.localinnerclass;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 22:00
 */
public class Outer {  //外部类
    private  int n1 = 10;
    private  int age = 12;
    public void m1(){
        //todo:局部内部类是定义在外部类的局部位置,比如方法中,并且有类名,通常在方法中
        /**
         * todo:局部内部类不能添加访问修饰符,但是可以使用final修饰
         */
        int a = 10;
        final int B = 20;
        final class Inner{  //局部内部类(本质仍然是一个类)
            public int n2 = 30;
            /**
             * 局部内部类的成员和外部类的成员重名
             */
            private int age = 18;
            public void f1(){
                //todo:直接访问外部类的成员(包括私有的成员)
                System.out.println("外部类属性:" + n1);
                m2();
                //todo:局部内部类作为方法的一部分，因此在局部内部类中还可以使用方法体中的局部变量，
                //    但是该局部变量必须是final声明的，即只能使用方法体中的常量。

                System.out.println(a);
                System.out.println(B);
                // todo：Java8以前需要手动加final，Java8以后系统自动加final，前提是方法中没其他位置修改该变量的值
                //Variable 'a' is accessed from within inner class, needs to be final or effectively final
                //a = 22;
            }
            public void f2(){
                System.out.println("局部内部类的方法");
            }
            /**
             * todo:如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
             *      访问外部类的成员则可以使用 外部类名.this.成员 去访问
             */
            public void fun(){
                System.out.println("局部内部类fun方法");
            }
            public void useMember(){
                //访问本类成员
                System.out.println(age);
                System.out.println(this.age);
                //访问外部类成员
                //todo:Outer.this本质上是一个外部类对象,谁调用useMember方法Outer.this就
                //   指向谁
                System.out.println(Outer.this.age);
                //访问本类成员
                fun();
                this.fun();
                //访问外部类成员
                Outer.this.fun();
            }
        }
        //todo:外部类访问局部内部类属性:创建对象，再访问,但是只能再内部类的作用域内
        Inner inner = new Inner();
        System.out.println("局部内部类的属性:" + inner.n2);
        inner.f2();
        inner.f1();
        System.out.println("局部内部类和外部类成员重名后");
        inner.useMember();
    }
    private void m2(){
        System.out.println("外部类私有方法");
    }
    public void fun(){
        System.out.println("外部类fun方法");
    }
}
