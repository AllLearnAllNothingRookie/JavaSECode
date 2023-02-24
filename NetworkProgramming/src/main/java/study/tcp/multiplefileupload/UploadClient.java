package study.tcp.multiplefileupload;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 13:33
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //1.连接服务器
        Socket socket = new Socket("192.168.134.1", 8888);

        //2.从键盘中输入文件的路径和名称
        Scanner input = new Scanner(System.in);
        System.out.println("请选择要上传的文件:");
        String path = input.nextLine();
        File file = new File(path);
        while (true){
            if (file.exists()){
                break;
            }
            System.out.println("文件不存在请重新输入:");
            path = input.nextLine();
            file = new File(path);
        }
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        //将文件名发送给服务端(含后缀名)
        //单独发送一个字符串
        dataOutputStream.writeUTF(file.getName());

        //3.发送文件内容到服务端
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] data = new byte[1024];
        int len = -1;
        while ((len = fileInputStream.read(data)) != -1){
            dataOutputStream.write(data,0,len);
        }
        //写入结束符
        socket.shutdownOutput();
        //4.结束服务器端返回的数据
        InputStream inputStream = socket.getInputStream();
        //把字节流转换为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        System.out.println(line);
        //5.关闭资源
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();
        fileInputStream.close();
        dataOutputStream.close();
        outputStream.close();
        input.close();
        socket.close();

    }
}
