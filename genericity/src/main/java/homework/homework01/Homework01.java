package homework.homework01;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/22 13:37
 */
public class Homework01 {
    public static void main(String[] args) {
        Dao<User> dao = new Dao<>(new HashMap<>());
        dao.save("1",new User(1,34,"tom"));
        dao.save("2",new User(2,29,"jack"));
        dao.save("3",new User(3,26,"jerry"));
        dao.save("4",new User(4,18,"smith"));
        dao.save("5",new User(5,23,"dennis"));
        dao.save("6",new User(6,36,"biden"));
        dao.save("7",new User(7,45,"nani"));
        System.out.println(dao.get("5"));
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }
        dao.update("6",new User(6,18,"rookie"));
         list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }
        dao.delete("7");
       list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }

    }
}
