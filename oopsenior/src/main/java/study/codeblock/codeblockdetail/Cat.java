package study.codeblock.codeblockdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 22:29
 */
public class Cat extends Animal{
    private static  int ears = initEars();
    private static  int nose = initNose();
    private int eye = initEye();
    private int mouth = initMouth();
    static {
        System.out.println("子类静态代码块1");
    }
    static {
        System.out.println("子类静态代码块2");
    }
    static {
        System.out.println("子类静态代码块3");
    }
    private static  int tail = initTail();
    {
        System.out.println("子类非静态代码块1");
    }
    {
        System.out.println("子类非静态代码块2");
    }
    {
        System.out.println("子类非静态代码块3");
    }
    private int foot = initFoot();
    public Cat(){
        //todo:相当与于隐藏了super([参数])和普通代码块和普通属性初始化
        //todo:调用父类构造器
        //super();
        //todo:调用本类普通代码块和普通属性初始化
        System.out.println("子类无参构造器");
    }

    public static int getEars() {
        return ears;
    }

    public static void setEars(int ears) {
        Cat.ears = ears;
    }

    public static int getNose() {
        return nose;
    }

    public static void setNose(int nose) {
        Cat.nose = nose;
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public static int getTail() {
        return tail;
    }

    public static void setTail(int tail) {
        Cat.tail = tail;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }
    public static int initEars(){
        System.out.println("ears子类静态属性初始化");
        return 2;
    }
    public static int initNose(){
        System.out.println("nose子类静态属性初始化");
        return 1;
    }
    public  int initEye(){
        System.out.println("eye子类普通属性初始化");
        return 2;
    }
    public  int initMouth(){
        System.out.println("mouth子类普通属性初始化");
        return 1;
    }
    public static int initTail(){
        System.out.println("tail子类静态属性初始化");
        return 1;
    }
    public  int initFoot(){
        System.out.println("foot子类普通属性初始化");
        return 4;
    }
}
