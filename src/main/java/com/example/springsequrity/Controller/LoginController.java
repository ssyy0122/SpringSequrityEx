package com.example.springsequrity.Controller;

import com.example.springsequrity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class LoginController {
private final UserService userService;

@GetMapping("/login")
    public String login(HttpServletRequest request) {
    return "login";
}

}
