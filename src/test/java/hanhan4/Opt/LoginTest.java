package hanhan4.Opt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    void checkUser() {
        Login lg = new Login();

        System.out.println(lg.CheckUser("admin", "password"));
        System.out.println(lg.CheckUser("headmaster", "password"));
        System.out.println(lg.CheckUser("teacher", "password"));
        System.out.println(lg.CheckUser("admin", "pwd"));
        System.out.println(lg.CheckUser("ad", "password"));
    }
}