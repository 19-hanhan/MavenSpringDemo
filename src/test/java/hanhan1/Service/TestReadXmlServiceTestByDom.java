package hanhan1.Service;

import hanhan1.Entity.User;
import org.junit.jupiter.api.Test;

class TestReadXmlServiceTestByDom {
    @Test
    public void test1() {
        TestReadXmlByDomService service = new TestReadXmlByDomService();
        service.register(new User());
    }
}