package alanrookie.exercise.thisexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 18:05
 */
public class ThisExerciseTest {
    public static void main(String[] args) {
        ThisExercise thisExercise = new ThisExercise("rookie",18);
        boolean too = thisExercise.compareTo("too", 18);
        System.out.println(too);
        boolean rookie = thisExercise.compareTo("rookie", 18);
        System.out.println(rookie);
        ThisExercise person = new ThisExercise("jack",19);
        boolean b = thisExercise.compareTo(person);
        System.out.println(b);
        person = new ThisExercise("rookie",18);
        boolean b1 = thisExercise.compareTo(person);
        System.out.println(b1);
    }
}
