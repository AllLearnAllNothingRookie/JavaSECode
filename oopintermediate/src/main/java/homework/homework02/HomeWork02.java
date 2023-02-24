package homework.homework02;

import homework.homework01.Person;
import java.util.function.DoubleToIntFunction;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 16:38
 * 要求有属性:姓名name,年龄age,职称post,基本工资salary,
 * 编写业务方法,introduce(),实现输出一共教师的信息。
 * 编写教师类的三个子类,教授类,副教授,讲师类,工资基本分别为1.3,1.2,1.1,在三个子类中分别重写
 *  introduce()方法
 * 定义并初始化,调用业务方法,实现对象的基本信息打印
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Professor professor = new Professor("Tom",46,"高级",10240,1.3);
        System.out.println(professor.introduce());
        AssociateProfessor associateProfessor = new AssociateProfessor("Jack",37,"中级",9600,1.2);
        System.out.println(associateProfessor.introduce());
        Lecturer lecturer = new Lecturer("Nobe",23,"初级",8800,1.1);
        System.out.println(lecturer.introduce());
    }
}
