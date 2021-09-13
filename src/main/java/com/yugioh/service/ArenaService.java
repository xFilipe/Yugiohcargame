package com.yugioh.service;

import com.yugioh.model.Arena;

import java.util.List;

public interface ArenaService {

    List<Arena> findAll();

    Arena findById(long id);

    Arena save(Arena arena);


}
