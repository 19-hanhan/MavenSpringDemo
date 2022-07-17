package hanhan5.Dao;

import hanhan5.Entity.Admin;

import java.util.List;

/**
 * @Author hanhan
 * @Date 2022/3/9 9:52
 */

public interface AdminDao {
    int SaveUser(Admin usr);
    List<Admin> FindByName(String name);
}
