package hanhan5.Dao.Impl;

import hanhan5.Dao.AdminDao;
import hanhan5.Entity.Admin;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hanhan
 * @Date 2022/3/9 9:53
 */

public class AdminDaoImpl implements AdminDao {
    public int SaveUser(Admin usr) {
        System.out.println("Save user success");
        return 0;
    }

    public List<Admin> FindByName(String name) {
        List<Admin> ls = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            ls.add(new Admin(name + i, "pwd" + i));
        }
        return ls;
    }
}
