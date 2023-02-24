package alanrookie.exercise.varparameterexercise;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 22:18
 */
public class VarParameterExerciseTest {
    public static void main(String[] args) {
        VarParameterExercise varParameterExercise = new VarParameterExercise();
        String score = varParameterExercise.showScore("张三", 90, 60, 50, 78, 80);
        System.out.println(score);
    }
}
