package study.innerclass.study.anonymousinnerclass.exercise.exercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/11 14:00
 * todo:匿名内部类的最佳实践
 *      当作实参直接传递,间接高效
 */
public class AnonymousInnerClassExercise {
    public static void main(String[] args) {
        //匿名内部类当作实参直接传递
        f1(new IA() {
            @Override
            public void show() {
                System.out.println("我是一个好人");
            }
        });
        //传统方式
        Car car = new Car();
        f1(car);
        f1(new Car());
    }

    /**
     * 形参是接口类型
     * @param ia
     */
    public static void f1(IA ia){
        ia.show();
    }
}
