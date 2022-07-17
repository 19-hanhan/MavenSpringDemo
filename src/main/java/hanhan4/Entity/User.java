package hanhan4.Entity;

/**
 * @Author hanhan
 * @Date 2022/3/8 8:39
 */

public abstract class User {

    public abstract void diff();

    public void same() {
        System.out.println("用户公共权限");
    }

}
