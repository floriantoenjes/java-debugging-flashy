package com.teamtreehouse.flashy.controllers;

import com.teamtreehouse.flashy.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

  @RequestMapping("/login")
  public String loginForm(Model model) {
    model.addAttribute("user", new User());
    return "login";
  }

}
