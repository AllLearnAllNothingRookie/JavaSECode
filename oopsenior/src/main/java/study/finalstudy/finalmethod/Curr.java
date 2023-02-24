package study.finalstudy.finalmethod;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 17:34
 */
public class Curr extends Top{

    @Override
    public void say() {
        super.say();
    }
    //todo:当不希望父类的方法被子类重写/覆盖(override)时,可以用final修饰
    //     final修饰的方法不能被子类重写/覆盖(override)
    //'show()' cannot override 'show()' in
    // 'study.finalstudy.finalmethod.Top'; overridden method is final
    /*@Override
    public final void show(){
        System.out.println("看看自己");
    }*/
}
