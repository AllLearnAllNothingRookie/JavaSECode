package alanrookie.homework.homework10;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 21:02
 */
public class PassObjectTest {
    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        passObject.printAreas(new Circle(),5);
        //或者
        Circle circle = new Circle();
        passObject.printAreas(circle,5);
    }
}
