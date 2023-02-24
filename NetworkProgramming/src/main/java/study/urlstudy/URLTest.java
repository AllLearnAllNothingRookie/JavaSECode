package study.urlstudy;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/17 10:58
 * 用URL对象表示“http://www.baidu.com:80/s?wd=尚硅谷”
 */
public class URLTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.baidu.com:80/s?wd=尚硅谷");
        System.out.println("协议：" + url.getProtocol());
        System.out.println("主机名：" + url.getHost());
        System.out.println("端口号：" + url.getPort());
        System.out.println("路径名：" + url.getPath());
        System.out.println("查询名：" + url.getQuery());
    }
}
