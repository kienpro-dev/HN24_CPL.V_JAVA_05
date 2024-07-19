package com.example.DemoSecurityMVC.controller;

import com.example.DemoSecurityMVC.entity.Account;
import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class BaseController {

    @GetMapping("/auth/login")
    public String getPage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof Account) {
            return "redirect:/index";
        }
        return "sig-in";
    }

    @GetMapping("/index")
    public String getPageIndex(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof Account) {
            model.addAttribute("currentUser", (Account) authentication.getPrincipal());
        } else {
            model.addAttribute("currentUser", null);
        }
        return "index";
    }
}
