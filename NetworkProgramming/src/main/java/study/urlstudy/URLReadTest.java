package study.urlstudy;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/17 11:12
 * 获取尚硅谷首页的网页内容。
 */
public class URLReadTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.atguigu.com");
        InputStream inputStream = url.openStream();
        byte [] data = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(data)) != -1){
            System.out.println(new String(data,0,len,"UTF-8"));
        }
        inputStream.close();
    }
}
