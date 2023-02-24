package study.polymorphic.study.polymorphicarray;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/28 20:57
 *  todo:多态数组：数组定义的类型为父类类型，里面保存的元素实际为子类类型
 */
public class PloyArray {
    //要求创建一个person 两个student和2个teacher对象统一放在一个数组里，并调用每个对象的say方法
    public static void main(String[] args) {
        Person [] persons = new Person[5];
        persons[0] = new Person("rookie",18);
        persons[1] = new Student("alan",18,99);
        persons[2] = new Student("alanRookie",18,100);
        persons[3] = new Teacher("ALAN",25,100000);
        persons[4] = new Teacher("ALANRookie",25,200000);
        //todo:这种方式不能调用子类的特有方法
        for (Person person : persons) {
            //person编译类型为Person 运行类型根据实际情况有JVM来判断
            System.out.println(person.say());
        }
        //调用子类特有的方法
        //todo:类型判断加向下转型
        for (Person person : persons) {
            //person编译类型为Person 运行类型根据实际情况有JVM来判断
            if (person instanceof Person){
                System.out.println(person.say());
            }
            if (person instanceof Student){
                /*Student student = (Student) person;
                student.study();*/
                //简化
                ((Student)person).study();
            }
            if (person instanceof  Teacher){
                /*Teacher teacher = (Teacher) person;
                teacher.teach();*/
                //简化
                ((Teacher)person).teach();
            }
            System.out.println("----------------------------------------");
        }
    }
}
