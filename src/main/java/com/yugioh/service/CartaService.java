package com.yugioh.service;



import com.yugioh.model.Carta;

import java.util.List;

public interface CartaService {
    List<Carta> findAll();

    Carta findById(long id);

    Carta save(Carta carta);
}
