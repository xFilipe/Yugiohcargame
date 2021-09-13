package com.yugioh.controller;

import com.yugioh.service.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {

    @GetMapping(value = "/")
    public String teste(){
        return "index";
    }

    @Autowired
    ArenaService arenaService;

}
