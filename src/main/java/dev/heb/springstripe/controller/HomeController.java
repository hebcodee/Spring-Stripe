package dev.heb.springstripe.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }

    @GetMapping("/cancel")
    public String cancel(){
        return "cancel";
    }

}
