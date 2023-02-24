package study.arrays;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 20:44
 */
public class Book {
    private String name;
    private double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
