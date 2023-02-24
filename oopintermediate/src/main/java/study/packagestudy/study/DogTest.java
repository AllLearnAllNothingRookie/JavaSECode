package study.packagestudy.study;

import study.packagestudy.study.admin.Dog;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/19 20:49
 */
public class DogTest {
    //包名自动导入了 可以省略包名
    Dog dogAdmin = new Dog();
    //用包名区分同名不同包的类
    //防止无法区分同名的类是那个包的类，所以采用包名进行区分
    study.packagestudy.study.user.Dog dogUser = new study.packagestudy.study.user.Dog();
}
