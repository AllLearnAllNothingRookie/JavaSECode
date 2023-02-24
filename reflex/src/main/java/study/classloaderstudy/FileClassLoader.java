package study.classloaderstudy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 9:29
 * 自定义类加载器
 */
public class FileClassLoader extends ClassLoader{
    /**
     * 指定加载路径
     */
    private String rootDir;

    public FileClassLoader(String rootDir) {
        this.rootDir = rootDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(name);
        if (c == null){
            ClassLoader parent = this.getParent();
           try {
               c = parent.loadClass(name);
           }catch (Exception e){
           }
            if (c == null){
                byte[] classData = getClassData(name);
                if (classData == null){
                    throw  new ClassNotFoundException();
                }else {
                    c = defineClass(name,classData,0,classData.length);
                }
            }
        }
        return c;
    }
    private byte[] getClassData(String name){
        String path = rootDir + File.separator + name.replace(".",File.separator) + ".class";
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try{
            is = new FileInputStream(path);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                baos.write(buffer,0,len);
            }
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
