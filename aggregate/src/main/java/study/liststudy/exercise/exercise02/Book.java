package study.liststudy.exercise.exercise02;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/6 17:26
 */
public class Book implements Comparable<Book> {
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        double diff = this.price - o.price;
        if (diff > 0){
            return  1;
        }else if (diff < 0){
            return  -1;
        }else {
            return 0;
        }
    }
}
