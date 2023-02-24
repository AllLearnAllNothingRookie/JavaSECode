package study.codeblock.codeblockdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 22:29
 */
public class Animal {
    private static  String name = initName();
    private static int ang = initAng();
    private int address = initAddress();
    private int colour = initColour();
    static {
        System.out.println("父类静态代码块1");
    }
    static {
        System.out.println("父类静态代码块2");
    }
    static {
        System.out.println("父类静态代码块3");
    }
    private static  String weight = initWeight();
    {
        System.out.println("父类普通代码块1");
    }
    {
        System.out.println("父类普通代码块2");
    }
    {
        System.out.println("父类普通代码块3");
    }
    private int n = initN();
    public Animal(){
        //todo:相当与于隐藏了super([参数])和普通代码块和普通属性初始化
        //todo:调用父类构造器
        //super();
        //todo:调用本类普通代码块和普通属性初始化
        System.out.println("父类无参构造器");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Animal.name = name;
    }

    public static int getAng() {
        return ang;
    }

    public static void setAng(int ang) {
        Animal.ang = ang;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public static String getWeight() {
        return weight;
    }

    public static void setWeight(String weight) {
        Animal.weight = weight;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    //属性初始化
    public static String initName(){
        System.out.println("name父类静态属性初始化");
        return "tom";
    }
    public static int initAng(){
        System.out.println("ang父类静态属性初始化");
        return 33;
    }
    public static String initWeight(){
        System.out.println("weight父类静态属性初始化");
        return "1kg";
    }
    public  int initAddress(){
        System.out.println("address父类普通属性初始化");
        return 22;
    }
    public  int initColour(){
        System.out.println("colour父类普通属性初始化");
        return 77;
    }
    public  int initN(){
        System.out.println("N父类普通属性初始化");
        return 77;
    }
}
