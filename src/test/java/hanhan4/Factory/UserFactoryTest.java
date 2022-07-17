package hanhan4.Factory;

import hanhan4.Entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {

    @Test
    void getUser() {
        UserFactory uf = new UserFactory();
        User tmp = null;

        tmp = uf.GetUser(1); tmp.same(); tmp.diff();
        tmp = uf.GetUser(2); tmp.same(); tmp.diff();
        tmp = uf.GetUser(3); tmp.same(); tmp.diff();
    }
}