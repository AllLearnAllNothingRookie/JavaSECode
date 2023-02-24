package study.liststudy.exercise.exercise02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/6 17:26
 */
public class ListExercise02 {
    public static void main(String[] args) {
        Book book1 = new Book("三国演义",187.89,"罗贯中");
        Book book2 = new Book("水浒传",167.50,"施耐庵");
        Book book3 = new Book("红楼梦",356.70,"曹雪芹");
        Book book4 = new Book("西游记",56.70,"吴承恩");
        //List<Book> list = new ArrayList();
        //List<Book> list = new LinkedList<>();
        List<Book> list = new Vector<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        System.out.println("=========排序前==========");
        for (Book book : list) {
            System.out.println(book);
        }
        System.out.println("===========排序后==========");
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0;j < list.size() - 1 - i;j ++){
                if (list.get(j).compareTo(list.get(j + 1)) > 0){
                    Book temp = list.get(j);
                    list.set(j,list.get(j + 1));
                    list.set(j + 1,temp);
                }
            }
        }
        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
