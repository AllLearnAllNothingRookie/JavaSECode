package study.tcp.multiplefileupload;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 13:52
 */
public class FileUploadThread extends Thread {
    private Socket socket;
    private String dir = "d:\\upload\\";
    public FileUploadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        FileOutputStream fos = null;
        try (
                InputStream is = socket.getInputStream();
                DataInputStream dataInputStream = new DataInputStream(is);
                OutputStream outputStream = socket.getOutputStream();
                PrintStream printStream = new PrintStream(outputStream);
                ){
            //读取文件(含后缀)
            String fielName = dataInputStream.readUTF();
            //截取后缀名
            int index = fielName.lastIndexOf(".");
            String substring = fielName.substring(index);
            //生成时间戳
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            String newFileName = fielName.substring(0,index) + simpleDateFormat.format(new Date());
            //用新文件构建文件输出流
            fos = new FileOutputStream(dir + newFileName + substring);
            //接收文件内容
            byte [] data = new byte[1024];
            int len = -1;
            while ((len = is.read(data)) != -1){
                fos.write(data,0,len);
            }
            //给客户端返回信息
            printStream.println(fielName + "已上传完毕");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
             if (fos != null){
                 try {
                     fos.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
