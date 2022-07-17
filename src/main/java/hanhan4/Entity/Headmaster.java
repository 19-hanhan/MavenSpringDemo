package hanhan4.Entity;

/**
 * @Author hanhan
 * @Date 2022/3/8 8:39
 */

public class Headmaster extends User {
    @Override
    public void diff() {
        System.out.println("校长私人权限");
    }
}
