package study.encapsulation.study.encap;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/20 16:49
 *  封装入门:
 *      设计一个类，不能人的年龄和工资等隐私，并对年龄进行合理的验证，
 *      年龄合理则设置，反之则默认，年龄必须在1~20之间，工资不能直接查看，name长度在2~6
 *
 *
 *
 * todo:封装(encapsulation)就是把抽象出来的数据[属性]和对数据的操作[方法]
 *      封装到一起，数据别保护在内部，程序的其他其他部分只有通过被授权的操作[方法]
 *      才能对数据进行操作。
 *       封装的好处：
 *      	1.隐藏调用细节
 * 	        2.可以对数据进行验证，保证安全合理
 *      封装实现步骤：
 * 	        1.将属性进行私有化 private[不能直接修改属性]
 * 	        2.提供一个公共的(public)方法，用于属性判断并赋值
 * 		    public void setXxx(类型 参数名){  // xxx:表示某个属性
 * 			    //加入数据验证的业务逻辑
 * 			    属性 = 参数名;
 *                }
 * 	        3.提供一个公共的get方法，用于获取属性的值
 * 		    piblic XX[要获取属性的类型] getXxxx(){
 * 			    //权限判断
 * 			    return xxx;
 *        }
 */
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 工作
     */
    private String job;
    /**
     * 薪水
     */
    private double salary;

    public Person() {
    }

    public Person(String name, int age, String job, double salary) {
       /* this.name = name;
        this.age = age;
        this.job = job;
        this.salary = salary;*/
        //我们可以将set方法放在构造器中进行数据校验，可以防止通过构造器赋非法值
        setName(name);
        setAge(age);
        setJob(job);
        setSalary(salary);
    }

    public void setName(String name){
        if (name.length() >= 2 && name.length()  <= 6){
            this.name = name;
        }else {
            this.name = "佚名";
        }
    }
    public String getName(){
        return name;
    }
    public void  setAge(int age){
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            age = 1;
        }
    }
    public Integer getAge(String name){
        if (this.name.equals(name)){
            return  age;
        }else {
            return  null;
        }
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public Double getSalary(String name){
        if (name.equals(this.name)){
            return salary;
        }else {
            return null;
        }
    }
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }
    public void info(){
        System.out.println("姓名:" + name + "年龄:" + age +"工作:" + job + "薪水:" + salary);
    }
}
