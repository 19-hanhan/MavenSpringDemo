package hanhan5.Controller;

import hanhan5.Dao.AdminDao;
import hanhan5.Dao.Impl.AdminDaoImpl;
import hanhan5.Entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author hanhan
 * @Date 2022/3/9 10:00
 */

@Controller
public class AdminController {
    @RequestMapping("/AdminList")
    public String FindByName(Model md, String name) {
        AdminDao dao = new AdminDaoImpl();
        List<Admin> ls = dao.FindByName(name);
        md.addAttribute("AdminList", ls);
        return "AdminList";
    }
}
