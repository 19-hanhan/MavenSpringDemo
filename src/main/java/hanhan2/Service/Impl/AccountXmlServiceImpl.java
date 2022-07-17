package hanhan2.Service.Impl;

import hanhan2.Dao.AccountDao;
import hanhan2.Entity.Account;
import hanhan2.Service.AccountService;

public class AccountXmlServiceImpl implements AccountService {

    private AccountDao dao;

    public void openAccount(Account ac) {
        dao.saveAccount(ac);
    }

    public AccountDao getDao() {
        return dao;
    }

    public void setDao(AccountDao dao) {
        this.dao = dao;
    }
}
