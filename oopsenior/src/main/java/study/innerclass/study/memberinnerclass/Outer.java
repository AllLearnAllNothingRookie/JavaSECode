package study.innerclass.study.memberinnerclass;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 14:48
 */
public class Outer {  //外部类

    private int n1 = 10;
    private String name = "张三";
    private  int score = 100;
    public void bonus(){
        System.out.println("10000000000");
    }
    /**
     * todo:成员内部类是定义在外部类的成员位置上
     *  成员内部类可以添加任意的访问修饰符(public,protected,默认,private)，因为
     *  成员内部类的地位就是一个成员
     */
  public class Inner{  //成员内部类
   //protected class Inner{  //成员内部类
    // class Inner{  //成员内部类
   // private class Inner{  //成员内部类
        //成员内部类属性
       private int age =18;
       String sex = "男";
        /**
         * 属性方法域外部类重名
         */
        private  int score = 99;
        public void bonus(){
            System.out.println("20000000000");
        }

        //成员内部类可以直接访问外部类的成员
        //todo:成员内部类访问外部类成员:访问方式:直接访问
        public void say(){
            System.out.println("外部类n1 = "  + n1 + "外部类name="  + name);
        }

        /**
         * todo:
         *  如果外部类和局部内部类的成员重名了后,默认遵循就近原则,如果想在局部内部类中
         *  访问外部类的成员则可以使用 外部类名.this.成员 去访问
         *  外部类名.this:本质就是一个外部类的对象,谁调用方法就是那个类
         */
        public void test(){
            //访问内部类属性
            System.out.println(score);
            System.out.println(this.score);
            //访问外部类属性
            System.out.println(Outer.this.score);
            //访问内部类方法
            bonus();
            this.bonus();
            //访问外部类属性
            Outer.this.bonus();
        }
    }
    public void f1(){
        //使用成员内部类
        //todo:.外部类访问成员内部类成员: 访问方式: 创建对象,再访问
        Inner inner = new Inner();
        inner.say();
        //可以范围私有属性
        System.out.println(inner.age);
        inner.test();
    }
    public Inner getInner(){
      return new Inner();
    }
}
