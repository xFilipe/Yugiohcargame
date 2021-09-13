package com.yugioh.service;

import com.yugioh.model.Deck;

import java.util.List;

public interface DeckService {
    List<Deck> findAll();

    Deck findById(long id);

    Deck save(Deck deck);

}
