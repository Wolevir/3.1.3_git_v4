package ru.freeomsk.springbootbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import ru.freeomsk.springbootbootstrap.dao.UserDao;
import ru.freeomsk.springbootbootstrap.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.freeomsk.springbootbootstrap.service.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/")
public class UserController {


    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String pageForUser(Model model, Principal principal) {
        model.addAttribute("user", userService.findByUsername(principal.getName()));
        return "users/userPage";
    }

    @GetMapping(value = "login")
    public String loginPage() {
        return "users/login";
    }

}
