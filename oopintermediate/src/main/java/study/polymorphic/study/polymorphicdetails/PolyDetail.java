package study.polymorphic.study.polymorphicdetails;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/27 13:39
 *todo:
 *    多态的前提:
 *        1.两个对象(类)存在继承关系
 *    I.多态的向上转型:
 *        1.向上转型的本质: 父类的引用指向子类的对象
 *        2.向上转型的语法: 父类的类型 引用名 = new 子类类型();
 *                        父类对象  引用名 = 子类引用;
 *                        父类引用 = 子类引用;
 *        3.向上转型的特点:  1.编译类型看左边,运行类型看右边。
 *                         2. 可以调用父类中的所有成员(需要遵守访问权限)
 *                         3. 不能调用子类的特有成员[只能调用子类重写的方法，
 *                            不能调用子类的属性,不管是和父类同名的还是不同名的属性都不能调用]
 *                          不能调用子类的特有成员: 因为在编译阶段，能调用那些成员是由编译类型决定的
 *                         4. 方法最终的运行效果要看子类的最终实现,即调用方法时，按照从运行类型类
 *                              开始查找方法，如果有则调用，没有则查找父类中的方法[规则和继承
 *                              方法调用一致]
 *       II.多态的向下转型:
 *          1.向下转型语法: 子类对象 引用名 = (子类对象) 父类引用;
 *          2.只能强制转换父类的引用不能强转父类的对象
 *          3.要求父类的引用必须指向的时当前目标类型的对象,即父类引用已经向上转型过
 *          4.可以调用子类类型中的所有成员
 *      III.  属性没有重写之说,属性的值看编译类型,即向上转型时不能调用运行类型的属性
 *           即属性和方法能不能调用看编译类型
 *           [编译类型里有的属性和方法才能调用，编译类型没有没有的属性和方法不能调用]，
 *                而方法调用时从运行类型开始查找
 *               属性则是直接使用编译类型的值
 *            示例见: polymorphicdetails2
*/
public class PolyDetail {
    public static void main(String[] args) {
        //todo:向上转型   父类的引用和指向子类的对象
        //  语法: 父类对象  引用名 = new 子类类型();
        //       父类对象  引用名 = 子类引用;
        //       父类引用  = 子类引用;
        Animal animal = new Cat();
        // todo: 父类不一定是直接父类也可以是间接父类
        //Object也是Cat的父类
        Object object = new Cat();
        Cat cat = new Cat();
        //todo:向上转型
        animal = cat;

        //todo: 可以调用父类中的所有成员[属性和方法](需要遵守访问权限)
        //      不能调用子类的特有成员[属性和方法]
        //      方法最终的运行效果要看子类的最终实现，
        //      不能调用子类的[所有属性不管是和父类同名的还是不同名的]属性
        //      [子类重写后的实现，如果没有重写则为父类的逻辑]
        System.out.println(animal.name);
        System.out.println(animal.age);
        // 运行时按照从子类开的查找，然后和调用，规则和继承中方法调用一致
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        //todo:不能调用子类的特有方法
        //animal.catchMouse();
        System.out.println("============================向下转型===========================");
        //todo: 向下转型
        Cat cat1 =  (Cat) animal;
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        cat1.eat();
        cat1.show();
        cat1.run();
        cat1.sleep();
        //调用子类特有的方法
        cat1.catchMouse();

        // todo:编译通过但运行会报错
        //    向下转型的前提时父类对象经过向上转型且转型的子类为当前子类类型
        //    即:要求父类的引用必须指向的时当前目标类型的对象
        // Exception in thread "main" java.lang.ClassCastException:
        // class polymorphic.study.polymorphicdetails.Animal cannot be cast to class
        // polymorphic.study.polymorphicdetails.Cat
        // (polymorphic.study.polymorphicdetails.Animal
        // and polymorphic.study.polymorphicdetails.Cat are in unnamed module of
        // loader 'app') at
        // polymorphic.study.polymorphicdetails.PolyDetail.main(PolyDetail.java:73)
        Cat cat2 = (Cat) new Animal();
        Animal animal1 = new Animal();
        cat2 = (Cat) animal1;
    }
}
