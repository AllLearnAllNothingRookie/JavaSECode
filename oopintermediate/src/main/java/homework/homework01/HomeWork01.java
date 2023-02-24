package homework.homework01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 15:35
 * 定义一个Person类(name,age,job),初始化Person对象数组，并按照age进行大小排序
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Person [] people = new Person[3];
        people[0] = new Person("Rookie",18,"Student");
        people[1] = new Person("tom",23,"java");
        people[2] = new Person("alanrookie",12,"student");
        System.out.println("排序前:");
        for (int i = 0;i < people.length;i ++){
            System.out.println(people[i]);
        }
        //冒泡排序
        for (int i = 0;i < people.length - 1;i ++){
            for (int j = 0;j < people.length - 1 - i;j ++){
                if (people[j].getAge() > people[j + 1].getAge()){
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        //输出
        System.out.println("排序后:");
        for (int i = 0;i < people.length;i ++){
            System.out.println(people[i]);
        }
    }
}
