package hanhan4.Entity;

/**
 * @Author hanhan
 * @Date 2022/3/8 8:40
 */

public class Teacher extends User {
    @Override
    public void diff() {
        System.out.println("教师私人权限");
    }
}
