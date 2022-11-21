package com.example.springsequrity.Controller;

import com.example.springsequrity.persistence.model.UserDto;
import com.example.springsequrity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
@GetMapping("/signUp")
    public String signUp(Model model){
    model.addAttribute("userDto",new UserDto());
    return "signUp";
}
@GetMapping("/signUp")
    public String signUp(@ModelAttribute("userDto") UserDto userDto){
    userService.insert(userDto);
    return "redirect:/login";
}

}
