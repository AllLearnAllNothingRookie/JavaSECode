package homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:27
 * 外部类
 */
public class A {
    private String name = "a";
    private String sex = "man";
    /**
     * 成员内部类
     */
    class B{
        private String name = "b";
        public void show(){
            System.out.println(name);
            System.out.println("外部类同名属性:" + A.this.name);
        }
    }
    public void show(){
        System.out.println(sex);
        System.out.println(name);
    }
    public void fun(){
        /**
         * 局部内部类
         */
        class C{
            private  String name = "c";
            private final String SEX = "男";
            public void show(){
                System.out.println("SEX = " + SEX);
                System.out.println(name);
                System.out.println("外部类属性:" + A.this.name);
            }
        }
        C c = new C();
        c.show();
        System.out.println(c.name);
    }
}
