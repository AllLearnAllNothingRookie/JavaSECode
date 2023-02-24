package alanrookie.homework.homework03;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 18:49
 * 编写一个类Book,定义方法updatePrice,实现更改某本书的价格，
 *  如果价格大于150，则改为150，如果价格大于100，更改为100，否则不变
 */
public class Book {
    String name;
    double price;
    String author;
    public Book(String name,double price,String author){
        this.name = name;
        this.price = price;
        this.author = author;
    }

    /**
     * 更改书的价格，如果价格大于150，则改为150，如果价格大于100，更改为100，否则不变
     */
    public void updatePrice(){
        if (this.price > 150){
            this.price = 150;
        }else if (this.price > 100){
            this.price = 100;
        }
    }

    /**
     * 输出书本信息
     */
    public void mag(){
        System.out.println("书名:" + this.name +"\t作者:" + this.author + "\t价格:" + this.price);
    }
}
