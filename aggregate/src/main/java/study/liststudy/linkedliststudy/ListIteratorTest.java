package study.liststudy.linkedliststudy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/16 22:52
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        //从指定位置往前遍历
        ListIterator listIterator = c.listIterator(c.size());
        while (listIterator.hasPrevious()){
            Object previous = listIterator.previous();
            System.out.println(previous);
        }
    }
}
