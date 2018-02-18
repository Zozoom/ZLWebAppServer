package com.zlwebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String home1() {
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/userList")
    public String userList() {
        return "/userList";
    }

    @GetMapping("/createUser")
    public String createUser() {
        return "createUser";
    }

    @GetMapping("/mobileApps")
    public String mobileApps() { return "/mobileApps"; }

    @GetMapping("/settings")
    public String settings() {
        return "/Error/404";
    }

    /** Error Pages **/
    @GetMapping("/404")
    public String error404() {
        return "/Error/404";
    }

    @GetMapping("/403")
    public String error403() {
        return "/Error/403";
    }

    /** Another Get back stuff **/
    @RequestMapping("/app")
    public String handler(Model model){
        model.addAttribute("msg", "a message from controller");
        return "my-page";
    }

}
