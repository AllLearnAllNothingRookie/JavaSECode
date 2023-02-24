package alanrookie.exercise.methodexercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/30 22:18
 */
public class MyTools {
    /**
     * 打印二维数组
     * @param array
     */
    public void printTwoArray(int[][] array){
        for (int i = 0;i < array.length;i ++){
            for (int j = 0;j < array[i].length;j ++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 拷贝Person
     * @param person
     * @return
     */
    public Person copyPerson(Person person){
        Person newPerson = new Person();
        newPerson.name = person.name;
        newPerson.age = person.age;
        newPerson.addr = person.addr;
        return newPerson;
    }
}
