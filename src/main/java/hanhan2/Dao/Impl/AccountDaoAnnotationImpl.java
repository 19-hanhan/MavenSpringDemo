package hanhan2.Dao.Impl;

import hanhan2.Dao.AccountDao;
import hanhan2.Entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoAnnotationImpl implements AccountDao {
    @Override
    public void saveAccount(Account ac) {
        System.out.println("You create account success by annotation");
    }

}
