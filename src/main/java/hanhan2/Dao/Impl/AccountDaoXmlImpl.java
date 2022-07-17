package hanhan2.Dao.Impl;

import hanhan2.Dao.AccountDao;
import hanhan2.Entity.Account;

public class AccountDaoXmlImpl implements AccountDao {
    private int cnt;

    public AccountDaoXmlImpl(int cnt) {
        this.cnt = cnt;
    }

    @Override
    public void saveAccount(Account ac) {
        System.out.println("You create account success by xml");
    }
}
