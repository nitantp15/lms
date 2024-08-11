package com.np.lms_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.np.lms_app.model.User;
import com.np.lms_app.service.UserService;

@org.springframework.stereotype.Controller
public class Controller {

	
    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        String s = varianl;
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/login";
    }
    

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
    
    @Value("${my.prop}")
    String varianl ;
    
    
    
}
