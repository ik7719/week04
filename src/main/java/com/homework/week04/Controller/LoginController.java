package com.homework.week04.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{

    @GetMapping("/login")
    public String loginPage()
    {
        return "redirect:/login-form.html";
    }

    @PostMapping("/login")
    public String loginProcess
            (
                     String id,
                    @RequestParam String password,
                    Model model
        )

    {
        if (id.equals(password))
        {
            model.addAttribute("loginId", id);
        }

        return "login-result";
    }
}

