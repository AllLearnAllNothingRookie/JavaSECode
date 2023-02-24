package alanrookie.study.constructordetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/11 23:34
 */
public class Cat {
    String name;
    int age;

    /**
     * 7.一旦定义了构造方法，默认的构造方法就覆盖了，就不能在使用默认的无参构造器，除非显示的定义一下
     */
    public Cat(String cName){
        name = cName;
    }

    public Cat(int cAge){
        age = cAge;
    }

    public Cat(String cName,int cAge){
        name = cName;
        age = cAge;
    }
}
