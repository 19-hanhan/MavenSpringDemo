package hanhan4.Entity;

/**
 * @Author hanhan
 * @Date 2022/3/8 8:40
 */

public class Admin extends User {
    @Override
    public void diff() {
        System.out.println("管理员权限");
    }
}
