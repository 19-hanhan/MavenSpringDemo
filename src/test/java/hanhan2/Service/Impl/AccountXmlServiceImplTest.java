package hanhan2.Service.Impl;

import hanhan2.Entity.Account;
import hanhan2.Service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class AccountXmlServiceImplTest {
    @Test
    void saveAccount() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hanhan2XmlBean.xml");
        AccountService service = ctx.getBean(AccountService.class);
        service.openAccount(new Account());
    }
}