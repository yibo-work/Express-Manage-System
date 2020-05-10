package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Clrvn
 */
@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
        session.getServletContext().removeAttribute(session.getId());
        return "login";
    }

    @GetMapping("/index")
    public String index(HttpSession session, Model model) {
        //默认，不用登录，测试用
        /*User user = new User();
        user.setId(1);
        user.setRoleId(1);
        user.setName("chen");
        user.setPassword("123qwe");
        session.setAttribute("USER", user);*/

        return "index";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    /**
     * 用户管理
     */
    @GetMapping("/userManage")
    public String userManage() {
        return "userManage";
    }

    @GetMapping("/homeUserManage")
    public String homeUserManage() {
        return "homeUserManage";
    }

    @GetMapping("/userAdd")
    public String userAdd() {
        return "userAdd";
    }

    @GetMapping("/userEdit")
    public String userEdit() {
        return "userEdit";
    }

    @GetMapping("/userView")
    public String userView() {
        return "userView";
    }

    @GetMapping("/editPassword")
    public String editPassword() {
        return "editPassword";
    }

    /**
     * 订单管理
     */
    @GetMapping("/orderListManage")
    public String orderListManage() {
        return "orderListManage";
    }

    @GetMapping("/orderListAdd")
    public String orderListAdd() {
        return "orderListAdd";
    }

    @GetMapping("/orderListEdit")
    public String orderListEdit() {
        return "orderListEdit";
    }

    @GetMapping("/orderListView")
    public String orderListView() {
        return "orderListView";
    }


}
