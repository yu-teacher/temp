package com.my.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qqq/*")
public class TempController {

    @GetMapping("/www")
    public String www(){

        return "/www";
    }
}
