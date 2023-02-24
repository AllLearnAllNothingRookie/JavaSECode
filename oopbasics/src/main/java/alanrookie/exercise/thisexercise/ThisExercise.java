package alanrookie.exercise.thisexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 18:01
 * this练习 ：  定义一个类，里面有name、age属性并提供compareTo比较方法，用于判断
 *  是否和另一个类相同，如果名字年龄一样就返回true否则返回false
 */
public class ThisExercise {
    String name;
    int age;
    public ThisExercise(){

    }
    public ThisExercise(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(String name,int age){
       /* if (name.equals(this.name) && this.age == age){
            return true;
        }
        return false;*/
        //简化
        return name.equals(this.name) && this.age == age;
    }
    public boolean compareTo(ThisExercise person){
        if (person != null){
            /*if (person.name .equals(this.name) && person.age == this.age){
                return true;
            }
            return false;*/
            //简化
            return person.name .equals(this.name) && person.age == this.age;
        }
        return false;
    }
}
