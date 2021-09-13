package com.yugioh.controller;

import com.yugioh.model.Arena;
import com.yugioh.service.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class ConfigController {


    // Arena
    @Autowired
    ArenaService arenaService;


    @GetMapping(value = "/arena")
    public String teste(){
        return "arena";
    }

    @PostMapping(value = "/cArena")
    public void criarArena(Arena arena){
        if(arena != null){
            try {
                arenaService.save(arena);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @GetMapping(value = "/lArena")
    public ModelAndView buscarArena() {
        ModelAndView mv = new ModelAndView("arenas");
        List<Arena> arenas = arenaService.findAll();
        mv.addObject("arenas", arenas);
        return mv;

    }









}
