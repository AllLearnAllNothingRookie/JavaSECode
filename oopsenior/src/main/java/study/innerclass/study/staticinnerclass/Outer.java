package study.innerclass.study.staticinnerclass;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 15:31
 */
public class Outer {
    private int n1 = 10;
    private static  String name = "李四";
    public void  hi(){
        System.out.println("外部非静态成员");
    }
    public static void show(){
        System.out.println("外部静态方法");
    }
    /**
     * 外部类和静态内部类成员重名
     */
    private static   int score = 99;
    public static void bonus(){
        System.out.println("20000000000");
    }
    /**
     * 静态内部类
     * todo:
     *  静态内部类可以添加任意访问修饰符(public,protected,默认,private),因为静态内部类
     *     的地位是一个成员
     */
    static class  Inner{
        public String sex = "男";
        /**
         * 外部类和静态内部类成员重名
         */
        private static   int score = 99;
        public static void bonus(){
            System.out.println("20000000000");
        }
        public void say() {
            /**
             * todo:态内部类可以直接访问外部类所有的静态成员,包含私有的,但是不能直接访问非静态成员
             *      静态内部类访问外部类成员: 访问方式:直接访问所有的静态成员,不能访问外部类非静态成员
             */
            // 不能访问外部类的非静态成员
            //System.out.println(n1);
            //hi();
            //只能访问外部类的静态成员
            System.out.println(name);
            show();
        }
        /** todo：
         *    如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
         *      访问外部类的成员则可以使用 外部类名.成员 去访问
         */
        public void test(){
            //访问静态内部类属性
            System.out.println(score);
            //访问外部类属性
            System.out.println(Outer.score);
            //访问静态内部类方法
            bonus();
            //访问外部类方法
            Outer.bonus();
        }
    }
    public void f1(){
        /**
         * todo:外部类访问静态内部类的成员:创建对象,再访问
         */
        Inner inner = new Inner();
        inner.say();
    }
    public Inner getInner(){
        return new Inner();
    }
    public static Inner getStaticInner(){
        return new Inner();
    }
}
