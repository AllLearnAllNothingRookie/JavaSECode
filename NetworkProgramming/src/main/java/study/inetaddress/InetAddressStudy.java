package study.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/13 15:50
 * todo: InetAddress类
 *  相关方法：
 *        1.获取本机InetAddress对象 getLocalHost
 *        2.根据指定主机名/域名获取ip地址对象  getByName
 *        3.获取InetAddress对象的主机名或域名
 *        getHostName
 *        4.获取InetAddress对象的地址  getHostAddress
 */
public class InetAddressStudy {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        //输出计算机名称和ip地址
        System.out.println(localHost);

        //根据指定主机名/域名获取ip地址对象
        InetAddress host = InetAddress.getByName("DESKTOP-EF4E88V");
        System.out.println(host);
        //根据域名获取InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);
        // 根据InetAddress对象获取主机名或域名
        String hostName = host2.getHostName();
        System.out.println(hostName);
        // 根据InetAddress对象获取IP地址
        String hostAddress = host.getHostAddress();
        System.out.println(hostAddress);
    }
}
