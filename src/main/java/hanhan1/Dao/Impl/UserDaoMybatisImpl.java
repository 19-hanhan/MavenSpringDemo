package hanhan1.Dao.Impl;

import hanhan1.Dao.UserDao;
import hanhan1.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMybatisImpl implements UserDao {
    @Override
    public int saveUser(User user) {
        System.out.println("save user success by mybatis...");
        return 0;
    }
}
