package hanhan2.Service.Impl;

import hanhan2.Dao.AccountDao;
import hanhan2.Entity.Account;
import hanhan2.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountAnnoationServiceImpl implements AccountService {
    @Autowired
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
