package study.interfacestudy.interfacepolymorphism.interfacepolypass;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/10 17:10
 * todo:多态传递
 */
public class PolyPass {
    public static void main(String[] args) {
        //接口类型的变量可以指向实现了该接口的类的对象实例
        IG ig = new Teacher();
        // IG 继承了 IH ,Teacher实现了IG,就相当于Teacher实现了IH
        //这就是所谓的多态传递现象
        IH ih = new Teacher();
    }
}
