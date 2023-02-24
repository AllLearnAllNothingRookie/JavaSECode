package study.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 20:45
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = {
                new Book("红楼梦",100),
                new Book("金瓶梅",90),
                new Book("青年文摘",5),
                new Book("Java从入门到放弃",128)
        };
        //排序 按照价格从低到高
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });
        System.out.println(Arrays.toString(books));
        //排序 按照价格从高到低
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getPrice() - o1.getPrice());
            }
        });
        System.out.println(Arrays.toString(books));
        //排序按照名字长短
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
        //排序按照名字长短逆序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().length() - o1.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
