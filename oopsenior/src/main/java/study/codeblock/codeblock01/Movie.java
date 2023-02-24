package study.codeblock.codeblock01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 17:48
 */
public class Movie {
    private String name;
    private double price;
    private String director;
    //构造器
    /**
     *  下面的构造器都有相同的语句
     *   这样看起来代码比较冗余
     *  解决方案:把相同的代码放在一个代码块中
     *  不管调用那个构造器创建对象都会调用代码块中的代码
     *  代码块的调用优先与构造器
     */
    {
        System.out.println("电影屏幕打开……代码块");
        System.out.println("广告开始……代码块");
        System.out.println("电影正式开始……代码块");
    }
    public Movie() {
        System.out.println("电影屏幕打开……");
        System.out.println("广告开始……");
        System.out.println("电影正式开始……");
    }

    public Movie(String name) {
        System.out.println("电影屏幕打开……");
        System.out.println("广告开始……");
        System.out.println("电影正式开始……");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("电影屏幕打开……");
        System.out.println("广告开始……");
        System.out.println("电影正式开始……");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("电影屏幕打开……");
        System.out.println("广告开始……");
        System.out.println("电影正式开始……");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
