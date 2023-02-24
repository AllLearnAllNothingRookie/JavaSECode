package study.network;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/13 11:32
 * todo:网络通信
 *      概念:两台设备之间通过网络实现数据传输
 *      网络通信：将数据通过网络从一台设备传输到另一台设备
 *      java.net包下提供了一系列的类或接口，供程序员使用，完成网络通信
 *todo: 网络
 *     概念:两台或多台设备通过一定物理设备连接起来构成了网络
 *     根据网络的覆盖范围不同，对网络进行分类:
 *        局域网：覆盖范围最小，仅仅覆盖一个教师或一个机房
 *        城域网：覆盖范围较大，可以覆盖一个城市
 *        广域网：覆盖范围最大，可以覆盖全国，甚至全球，万维网是广域网的代表
 *todo:
 * ip地址：
 *   概念：ip地址用于标识网络中的每台计算机/主机
 *   ip地址的标识形式：点分十进制 xx.xx.xx.xx
 *   每一个是兼职的范围0 ~ 255
 *   ip地址的组成： 网络地址 + 主机地址
 *   ipv6是互联网工程上用于替换ipv4的下一代协议
 *todo:
 *     域名：
 *          好处：为了方便记忆，解决记ip的困难
 *          概念：将ip地址映射成域名
 *     端口号：
 *          概念：用于标识计算机上某个特定的网络程序
 *          表示形式：以整数形式，范围 0 ~ 65535
 *          0~1024 已经被占用，比如：ssh: 22 ftp:21 smtp: 25 http: 80
 *          常见的网络程序端口：
 *             tomcat：8080
 *             mysql: 3306
 *             Oracle： 1521
 *             sqlServer: 1433
 * todo:网络协议
 *      TCP/IP协议
 *todo: TCP和UDP
 *      TCP协议： 传输控制协议
 *         1.使用TCP协议之前，须先建立TCP连接，形成传输数据通道
 *         2.传输之前，采用"三次握手"方式，是可靠的
 *         3.TCP协议进行通信的两个应用进程：客户端、服务端
 *         4.在连接中可以进行大数据量的传输
 *         5.传输完毕，须释放已建立的连接，效率低
 *       UDP协议:  用户数据协议
 *          1.将数据、源、目的地封装成数据包，不需要建立连接
 *          2.每个数据报的大小限制在64K内，不适合传输大量数据
 *          3.因无需连接，故是不可靠的
 *          4.发送数据结束时无需释放资源(因为不是面向连接的)，速度快
 */
public class NetWork {
}