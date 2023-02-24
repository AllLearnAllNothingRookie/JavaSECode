package study.iostream.exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/10 14:46
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("d:\\account.dat"));
            Object readObject = ois.readObject();
            System.out.println(readObject);
            System.out.println(Account.getInterestRate());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
