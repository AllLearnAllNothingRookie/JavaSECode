package alanrookie.exercise.methodexercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/30 22:22
 */
public class MethodExercise02Test {
    public static void main(String[] args) {
        MyTools tools = new MyTools();
        //打印二维数组
        int[][] array = {{1,3,54,3},{2,3,56,3},{4,3,2},{6,8,3}};
        tools.printTwoArray(array);
        //拷贝person
        Person person = new Person();
        person.name ="李四";
        person.age = 29;
        person.addr = "中国";
        System.out.println("姓名:" + person.name + ",年龄:" + person.age + ",居住地:" + person.addr);
        Person person1 = tools.copyPerson(person);
        System.out.println("姓名:" + person1.name + ",年龄:" + person1.age + ",居住地:" + person1.addr);
        //修改
        person1.age = 45;
        System.out.println("姓名:" + person.name + ",年龄:" + person.age + ",居住地:" + person.addr);
        System.out.println("姓名:" + person1.name + ",年龄:" + person1.age + ",居住地:" + person1.addr);

    }
}
