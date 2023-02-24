package study.streamapi;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/22 10:38
 * todo:StreamAPI
 *     Stream API (java.util.stream),把函数式编程风格引入到java中，
 *     Stream是Java8中处理集合的关键抽象概念，它可以指定你希望对集合进行的操作，可以执行非常
 *        复杂的查找，过滤和映射数据等操作，使用Stream API对集合数据进行操作，就类似与使用
 *        SQL执行的数据库查询。也可以使用Stream API来执行操作。简而言之，Stream API提供了
 *        一种高效且易于使用的处理数据的方式。
 *     实际开发中，项目中多数数据源都来自Mysql，Oracle等，但现在数据源可以更多了，有MongDB
 *          Redis等，而这写NoSql的数据就需要Java层面去处理
 *      Stream和Collection集合的区别： Collection是一种静态的内存数据结构，而Stream是有关
 *          计算的。前者是主要面向内存，存储在内存中，后者主要是面向CPU，通过CPU实现计算。
 *      Steam 是数据通道，用于操作数据源(集合，数组等)所生成的元素序列。集合讲的是
 *         数据，stream讲的是计算
 *      注意：
 *         1.stream不会存储数据
 *         2.stream不会改变源对象，相反，会返回一个持有结果的新Stream
 *         3.Stream操作是延迟执行的。这意味着会等到需要结果的时候才执行
 *todo: Stream的操作三个步骤
 *      1. 创建Stream
 *        一个数据源(如，数组、集合),获取一个流
 *      2.中间操作
 *        一个中间操作链，对数据源的数据进行处理
 *      3.终止操作(终端操作)
 *        一旦执行终止操作，就执行中间操作链，并产生结果，之后，不会再被使用
 */
public class StreamApi {

}
