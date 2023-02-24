package alanrookie.study.scopedetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/10 21:34
 */
public class ScopeDetailTest {
    public static void main(String[] args) {
        /**
         * 当创建ScopeDetail对象时， ScopeDetail对象的属性如name会创建
         */
        ScopeDetail scopeDetail = new ScopeDetail();
        //全局变量被其他类使用(通过对象调用)
        System.out.println(scopeDetail.name);
        /**
         * 属性的生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁
         *局部变量生命周期较短，伴随着它所在的代码块/方法/构造器的执行而创建，
         * 伴随着它所在的代码块/方法/构造器的结束而销毁，即在溢出方法的调用过程中生效。
         */
        /**
         * 当执行say方法时，say方法的局部变量如name会创建
         */
        scopeDetail.say();
        /**
         * 当执行完毕say方法时，say方法的局部变量如name会销毁
         * 但是属性任然可以使用
         */
        scopeDetail.eat();
        scopeDetail.study();
    }
    /**
     * 当销毁ScopeDetail对象时， ScopeDetail对象的属性如name会销毁
     */
}
