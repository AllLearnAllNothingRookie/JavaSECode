package alanrookie.exercise.varparameterexercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 22:14
 * 可变参数练习
 *  将三个方法：返回姓名两门课的总成绩，返回姓名三门课的总成绩，返回姓名五门课的总成绩
 *  封装为一个可变参数的方法
 */
public class VarParameterExercise {
    /**
     * 求多门课的总成绩
     * @param name
     * @param scores
     */
    public String showScore(String name,double ... scores){
        double sumScore = 0;
        for (double score : scores) {
            sumScore += score;
        }
       // System.out.println(name + scores.length + "门课的总成绩为:" + sumScore);
        return name + scores.length + "门课的总成绩为:" + sumScore;
    }
}
