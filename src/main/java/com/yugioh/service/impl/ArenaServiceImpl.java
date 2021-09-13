package com.yugioh.service.impl;

import com.yugioh.model.Arena;
import com.yugioh.repository.ArenaRepository;
import com.yugioh.service.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArenaServiceImpl implements ArenaService {

    @Autowired
    ArenaRepository arenaRepository;

    @Override
    public List<Arena> findAll() {
        return arenaRepository.findAll();
    }

    @Override
    public Arena findById(long id) {
        return arenaRepository.findById(id).get();
    }

    @Override
    public Arena save(Arena arena) {
        return arenaRepository.save(arena);
    }
}
