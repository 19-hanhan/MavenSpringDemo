package hanhan1.Dao.Impl;

import hanhan1.Dao.UserDao;
import hanhan1.Entity.User;

public class UserDaoJdbcImpl implements UserDao {
    @Override
    public int saveUser(User user) {
        System.out.println("save user success by jdbc...");
        return 0;
    }
}
