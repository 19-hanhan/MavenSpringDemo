package hanhan4.Opt;

/**
 * @Author hanhan
 * @Date 2022/3/8 8:42
 */

public class Login {

    public boolean IsEmpty(String str) { // 输入判空
        str = str.trim();
        return str == null || str == "";
    }

    public int CheckUser(String usr, String pwd) {

        if (IsEmpty(usr) || IsEmpty(pwd)) { // 输入错误
            return -1;
        }

        if (usr.equals("admin") && pwd.equals("password")) { // 1——管理员
            return 1;
        } else if (usr.equals("headmaster") && pwd.equals("password")) { // 2——校长
            return 2;
        } else if (usr.equals("teacher") && pwd.equals("password")) { // 3——教师
            return 3;
        } else { // 0——查无此人
            return 0;
        }

    }

}
