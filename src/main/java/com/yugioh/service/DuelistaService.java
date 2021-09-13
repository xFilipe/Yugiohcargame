package com.yugioh.service;


import com.yugioh.model.Duelista;

import java.util.List;

public interface DuelistaService {

    List<Duelista> findAll();

    Duelista findById(long id);

    Duelista save(Duelista duelista);
}
