package study.finalstudy.finalvar;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/8 17:41
 * todo: final可以修饰类、属性、方法和局部变量
 *  1.当不希望类被继承时,可以用final修饰  -- final修饰的类不能被继承
 *  2.当不希望父类的方法被子类重写/覆盖(override)时,可以用final修饰
 *      --final修饰的属性不能被子类重写/覆盖(override))
 *  3.当不希望类的某个属性的值被修改,可以用final修饰
 *  4.当不希望局部变量被修改,可以使用final修饰
 *     --final修饰的变量是常量,不能被修改
 */
public class FinalVar {
    //todo:当不希望类的某个属性的值被修改,可以用final修饰
    public static final  int TAX_RETE = 10;
    public static int age = 10;
    public static void main(String[] args) {
        //todo:当不希望类的某个属性的值被修改,可以用final修饰
        //Cannot assign a value to final variable 'TAX_RETE'
        //TAX_RETE = 100;
        age = 18;
        //todo:当不希望局部变量被修改,可以使用final修饰
        final int A = 10;
        //Cannot assign a value to final variable 'A'
        //A = 11;
        int b = 10;
        b = 11;
    }
}
