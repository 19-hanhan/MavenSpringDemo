package hanhan2.Factory;

import hanhan2.Dao.AccountDao;
import hanhan2.Dao.Impl.AccountDaoXmlImpl;

public class BeanFactory {
    public static AccountDao CreateXmlAccountDaoStatic() {
        return new AccountDaoXmlImpl(6);
    }

    public AccountDao CreateXmlAccountDao() {
        return new AccountDaoXmlImpl(6);
    }
}
