package com.example.hellothymeleaf.controller;

import com.example.hellothymeleaf.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping()
    public String index(Model model, HttpSession session) {

        User user = User.builder().
                lastName("GS").
                firstName("B").
                nationality("Korea").
                isAdmin(true).
                age(10).
                build();

        session.setAttribute("user", user);
        session.setAttribute("job", "dev");

        model.addAttribute("hello", "hello from Server");
        model.addAttribute("user", user);



        List<User> users = new ArrayList();
        users.add(user);
        users.add(User.builder().firstName("AA").lastName("AA").age(20).build());
        users.add(User.builder().firstName("BB").lastName("BB").age(30).build());
        users.add(User.builder().firstName("CC").lastName("CC").age(40).build());

        model.addAttribute("users", users);

        return "index";
    }

}
