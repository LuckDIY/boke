package com.boke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping
    public String view(ModelMap modelMap){
        modelMap.put("ttt","实时路况江东父老开裆裤");
        return "themes/louie_senpai_siren/post";
    }
}
