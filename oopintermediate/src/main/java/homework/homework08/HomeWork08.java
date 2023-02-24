package homework.homework08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/2 9:23
 */
public class HomeWork08 {
    public static void main(String[] args) {
        Person [] people = new Person[4];
        people[0] = new Student("alanRookie",18,'M',"201817025224");
        people[1] = new Student("rookie",12,'M',"99999999");
        people[2] = new Teacher("tom",49,'M',25);
        people[3] = new Teacher("jack",26,'M',2.5);
        //排序
       /* for (int i = 0;i < people.length - 1;i ++){
            for (int j = 0;j < people.length - i - 1;j ++ ){
               if (people[j].getAge() > people[j + 1].getAge()){
                   Person temp = people[j];
                   people[j] = people[j + 1];
                   people[j + 1] = temp;
               }
            }
        }*/
        personSort(people);
        //输出
        //todo：也可以将所有的封装信息整合到一个方法里
        for (Person person : people) {
            //输入个人信息
            System.out.println(person);
            //调用特有方法
            useMonth(person);
            //调用重写方法
            System.out.println(person.play());
            System.out.println("-------------------------------------------");
        }
        System.out.println("==================================================");
        for (Person person : people) {
            printInfo(person);
            System.out.println("-------------------------------------------");
        }
    }

    /**
     * 输出信息
     * @param person
     */
    public static void useMonth(Person person){
        if (person instanceof Student){
            Student student = (Student) person;
            student.study();
        }
        if (person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            teacher.teach();
        }
    }

    /**
     * 输入信息
     * @param person
     */
    public static void printInfo(Person person){
        if (person instanceof Student){
            Student student = (Student) person;
            student.studentInfo();
        }
        if (person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            teacher.teacherInfo();
        }
    }

    /**
     * 将冒泡排序封装为方法
     * @param people
     */
    public static void personSort(Person [] people){
        //排序
        for (int i = 0;i < people.length - 1;i ++){
            for (int j = 0;j < people.length - i - 1;j ++ ){
                if (people[j].getAge() > people[j + 1].getAge()){
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

    }
}
