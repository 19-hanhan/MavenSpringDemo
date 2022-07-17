package hanhan4.Factory;

import hanhan4.Entity.Admin;
import hanhan4.Entity.Headmaster;
import hanhan4.Entity.Teacher;
import hanhan4.Entity.User;

/**
 * @Author hanhan
 * @Date 2022/3/8 8:59
 */

public class UserFactory {

    public User GetUser(int num) {
        if (num == 1) {
            return new Admin();
        } else if (num == 2)  {
            return new Headmaster();
        } else if (num == 3)  {
            return new Teacher();
        } else {
            System.out.println("输入错误，无此类用户");
            return null;
        }
    }
}
