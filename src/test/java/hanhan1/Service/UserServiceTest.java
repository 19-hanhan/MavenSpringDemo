package hanhan1.Service;

import hanhan1.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceTest {

    @Test
    void register() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hanhan1beans.xml");
        UserService service = ctx.getBean(UserService.class);
        service.register(new User());
    }

}