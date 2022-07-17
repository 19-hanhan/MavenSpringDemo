package hanhan2.Service.Impl;

import hanhan2.Entity.Account;
import hanhan2.Service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class AccountAnnoationServiceImplTest {
    @Test
    void saveAccount() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hanhan2AnnoationBean.xml");
        AccountService service = ctx.getBean(AccountService.class);
        service.openAccount(new Account());
    }
}