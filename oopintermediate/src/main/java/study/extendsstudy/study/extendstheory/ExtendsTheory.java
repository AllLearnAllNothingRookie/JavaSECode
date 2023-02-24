package study.extendsstudy.study.extendstheory;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/22 22:09
 */
public class ExtendsTheory {
    public static void main(String[] args) {
        /**
         * todo:子类访问属性方法是要按照查找关系来返回信息：
         *    1.首先查找子类是否有该属性/方法
         *    2.如果子类有这个属性/方法，并且可以访问，则返回信息
         *    3.如果子类没有这个属性，则查看父类有没有这属性/方法(如果父类有该属性,并且
         *      可以访问就返回信息)
         *    4.如果父类没有则按照3的规则，继续找上级父类，知道Object
         *
         *    todo:如果都没有则报错，如果属性/方法 存在且私有，不管父类有有没有属性/方法，
         *          属性/方法 公开不公开都会报错
         *           比如直接父类有属性/方法,并且方法私有，而且间接父类也有该属性/方法
         *             并且非私有，你们当调用该属性/方法会报错
         *
         */
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.age);
        System.out.println(son.hobby);
        //父类私有有属性，父类的父类有属性公开
        //java: sex 在 extendsstudy.study.extendstheory.Father 中是 private 访问控制
        //System.out.println(son.sex);
    }
}
