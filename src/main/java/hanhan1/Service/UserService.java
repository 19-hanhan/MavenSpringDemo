package hanhan1.Service;

import hanhan1.Dao.UserDao;
import hanhan1.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao dao;

    public void register(User usr) {
        dao.saveUser(usr);
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

}
