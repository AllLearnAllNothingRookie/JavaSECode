package study.extendsstudy.override.study.overridedetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/26 17:39
 *  todo:
 *   方法重写细节:
 *      1.子类的方法的参数、方法名称要和父类的方法的参数、方法名称一样
 *      2.子类方法的返回类型要和父类方法的返回类型一样，或者是父类返回类型的子类
 *      3.子类方法不能缩小父类方法的访问权限
 */
public class Current extends Superior{
    /**
     * todo:1.子类的方法的参数、方法名称要和父类的方法的参数、方法名称一样
     */
    public  void say(String name){
        System.out.println(name + "说话");
    }
    //参数不与父类一样不构成重载
    public  void say(String name,String a){
        System.out.println(name + "说话");
    }
   //方法名不与父类一样不构成重载
    public  void say1(String name){
        System.out.println(name + "说话");
    }

    /**
     * todo:子类方法的返回类型要和父类方法的返回类型一样，或者是父类返回类型的子类
     */
    //String是Object的子类
    public String sayOk(String name){
        return "";
    }
    //返回类型与父类一样构成重载
    /*
    public Object sayOk(String name){
        return "";
    }
    */
    ////返回类型与父类一样构成重载
   /* public Father study(){
        return null;
    }*/
    //返回类型是父类方法返回类型的子类
    public Son study(){
        return null;
    }
    //返回类型不是父类方法返回类型的子类，不构成重载
    //'study()' in 'override.study.overridedetail.Current'
    // clashes with 'study()' in 'override.study.overridedetail.Superior';
    // attempting to use incompatible return type
   /* public String study(){
        return null;
    }*/
    //todo：父类返回基本类型,子类返回类型可以自动类型转换成父类返回类型的不构成重载
    //'getDouble()' in 'override.study.overridedetail.Current' clashes with 'getDouble()'
    // in 'override.study.overridedetail.Superior';
    // attempting to use incompatible return type
    /*public int getDouble(){
        return  1;
    }*/
    /**
     * todo :3.子类方法不能缩小父类方法的访问权限
     *    访问修饰符权限: public >  protected  > 默认 > private
     */
    //todo:访问修饰符和父类一样构成重载
    /*public void method01() {
        super.method01();
    }*/
    //todo:子类方法返回类型小于父类不构成重载  默认 < public
    //'method01()' in 'override.study.overridedetail.Current'
    // clashes with 'method01()' in 'override.study.overridedetail.Superior';
    // attempting to assign weaker access privileges ('package-private');
    // was 'public'
    /*
    void method01(){

    }
    */
    //todo:子类方法返回类型小于父类不构成重载  rotected < public
    //'method01()' in 'override.study.overridedetail.Current'
    // clashes with 'method01()' in 'override.study.overridedetail.Superior';
    // attempting to assign weaker access privileges ('protected'); was 'public'
    /*protected void method01(){

    }*/

    //todo:访问修饰符和父类一样构成重载
    /*protected void method02() {
        super.method02();
    }*/
    //todo:子类方法访问修饰符大于父类方法访问修饰符构成重载 pubic > protected
   /* public void method02() {
        super.method02();
    }*/
    // todo:子类方法返回类型小于父类不构成重载 protected > 默认
    //'method02()' in 'override.study.overridedetail.Current' clashes
    // with 'method02()' in 'override.study.overridedetail.Superior';
    // attempting to assign weaker access privileges ('package-private');
    // was 'protected'
     /*void method02() {
        super.method02();
    }*/

    //todo:访问修饰符和父类一样构成重载
   /* void method03() {
        super.method03();
    }*/
    //todo:子类方法访问修饰符大于父类方法访问修饰符构成重载 protected > 默认
   /*protected void method03() {
        super.method03();
    }*/

    //todo:子类方法访问修饰符大于父类方法访问修饰符构成重载 pubic > 默认
    /*public  void method03() {
        super.method03();
    }*/
    // todo:子类方法返回类型小于父类不构成重载   默认 > rivate
    //'method03()' in 'override.study.overridedetail.Current'
    // clashes with 'method03()' in 'override.study.overridedetail.Superior';
    // attempting to assign weaker access privileges ('private');
    // was 'packageLocal'
    /*private void method03() {
        super.method03();
    }*/

}
