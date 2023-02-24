package alanrookie.homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 18:56
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("三体",189.9,"刘慈欣");
        book.mag();
        book.updatePrice();
        book.mag();
        Book book1 = new Book("Java编程思想",138,"alanrookie");
        book1.mag();
        book1.updatePrice();
        book1.mag();
        Book book2 = new Book("Go语言程序设计",78,"alanrookie");
        book2.mag();
        book2.updatePrice();
        book2.mag();
    }
}
