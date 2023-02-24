package study.urlstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/17 11:20
 * 在百度搜索页提交“尚硅谷”搜索关键字
 */
public class URLConnectionTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://baidu.com");
        //通过URL对象调用openConnection方法创建连接对象URLConnection
        URLConnection urlConnection = url.openConnection();
        //处理设置参数
        urlConnection.setDoOutput(true);
        //给服务器发生请求参数
        urlConnection.getOutputStream().write("wd=尚硅谷".getBytes());
        //使用connect方法建立到远程对象的实际连接
        urlConnection.connect();
        //获取资源
        InputStream is = urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        //关闭资源
        br.close();
    }
}
