package com.kyle.olddriver.controller;

import com.kyle.olddriver.entity.User;
import com.kyle.olddriver.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Kyle.LJ
 * @Title: UserController
 * @ProjectName olddriver
 * @Description: TODO
 * @date 2018/8/1011:17 AM
 */
@Controller
public class UserController {

    @Autowired
    UserInfoService userService;

    @RequestMapping("/login")
    public String index() {
        return "login";
    }

    /**
     * 去注册页面
     *
     * @return
     */
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * 执行注册 成功后登录页面 否则调回注册页面
     *
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("/doregister")
    public String doregister(HttpServletRequest request, User user) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //String password2 = request.getParameter("password2");
//        if (password.equals(password2)) {
            if (registerUser(username) == true) {
                User user1 = new User();
                user1.setUsername(username);
                user1.setPassword(password);
                userService.save(user1);
                return "login";
            } else {
                return "register";
            }
//        } else {
//            return "register";
//        }
    }

    public Boolean registerUser(String username) {
        Boolean a = true;
        if (userService.findByName(username).isEmpty()) {
            return a;
        } else {
            return false;
        }
    }

    /**
     * 去登录页面
     *
     * @return
     */
//    @RequestMapping("/login")
//    public String login() {
//        return "login";
//    }

    /**
     * 执行登录
     *
     * @param request
     * @return
     */
    @RequestMapping("/dologin")
    public String login(HttpServletRequest request,Map<String, Object> map) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.FindNameAndPsw(username, password);
        String str = "";
        if (user != null) {
            str = "redirect:/teacherList";
        } else {
            map.put("msg","用户名或密码错误！");
            str = "login";
        }
        return str;
    }


}
