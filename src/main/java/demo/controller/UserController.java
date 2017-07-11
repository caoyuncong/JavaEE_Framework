package demo.controller;

import demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by caoyuncong on
 * 2017/7/10 19:44
 * JavaEE_Framework.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("create")
    private String create(User user) {
        System.out.println("create..");
        return "redirect:/index.jsp";
    }
}
