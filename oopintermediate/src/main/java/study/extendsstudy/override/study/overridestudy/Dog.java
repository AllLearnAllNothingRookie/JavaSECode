package study.extendsstudy.override.study.overridestudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/26 17:30
 * todo:
 *   方法重写: 就是子类有一个方法何父类的,某个方法的名称、返回类型、参数一样，就可以说子类的
 *           方法重写了父类(父类不一定是直接父类，也可以是间接父类)的方法
 */
public class Dog  extends Animal{
    /**
     * todo:方法重写: 就是子类有一个方法何父类的,某个方法的名称、返回类型、参数一样，就可以说子类的
     *          方法重写了父类(父类不一定是直接父类，也可以是间接父类)的方法
     */
    @Override
    public void cry() {
        System.out.println("小狗汪汪叫");
    }
}
