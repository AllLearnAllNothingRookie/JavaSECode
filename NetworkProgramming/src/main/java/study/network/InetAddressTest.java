package study.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/17 9:58
 * 用InetAddress对象分别表示本机的IP地址、尚硅谷官网IP地址、值为“222.222.88.102”。
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        //获取表示本机的IP地址的InetAddress实例
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println("hostAddress" + localHost.getHostAddress());
        System.out.println("hostName" + localHost.getHostName());
        //获取表示尚硅谷官网IP地址的InetAddress实例
        InetAddress domain = InetAddress.getByName("www.atguigu.com");
        System.out.println(domain);
        System.out.println("hostAddress" + domain.getHostAddress());
        System.out.println("hostName" + domain.getHostName());
        //获取表示值为“222.222.88.102”地址的InetAddress实例
        byte[] ip = {(byte) 222,(byte) 22,88,102};
        InetAddress address = InetAddress.getByAddress(ip);
        System.out.println(address);
        System.out.println("hostAddress" + address.getHostAddress());
        System.out.println("hostName" + address.getHostName());
    }
}
