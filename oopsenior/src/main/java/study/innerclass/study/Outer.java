package study.innerclass.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 20:46
 * todo: 内部类
 *      一个类的内部又完整的嵌套了另一个类结构,被嵌套的那个类称为内部类(inner class),嵌套其他类
 *      的类称为外部类(outer class),是类的第五大成员,内部类最大特点就是可以直接访问私有属性
 *      并且可以体现类与类之间的包含关系.
 *      基本语法:
 *      访问修饰符 class 外部类名{  // 外部类
 *          访问修饰符  class 内部类名{  // 内部类
 *          }
 *      }
 *      访问修饰符 class 类名{   // 外部其他类
 *      }
 *     内部类的分类:
 *       1.定义在外部类的局部位置上(比如方法内,代码块内,构造器内等)
 *          1.局部内部类(有类名)
 *          2.匿名内部类(没有类名)
 *       2.定义在外部类的成员位置上
 *          1.成员内部类(没有static修饰)
 *          2.静态内部类(使用static修饰)
 */
public class Outer {
    /**
     * 外部类的属性
     */
    private int n1 = 10;

    /**
     * 外部类的构造器
     */
    public Outer(){

    }
    public Outer(int n1){
        this.n1 = n1;
    }

    /**
     * 外部类的代码块
     */
    {
        System.out.println("代码块");
    }

    /**
     * 外部类的方法
     */
    public void hi(){
        System.out.println("方法");
    }
    /**
     * 内部类
     */
    class Inner{
        /**
         * 内部类的属性
         */
        private int n2 = 20;

        /**
         * 内部类的构造器
         */
        public Inner(){

        }
        public Inner(int n2){
            this.n2 = n2;
        }

        /**
         * 内部类的代码块
         */
        {
            System.out.println("内部类代码块");
        }

        /**
         * 内部类的方法
         */
        public void say(){
            System.out.println("内部类方法");
        }
    }
}
