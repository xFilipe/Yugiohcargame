package com.yugioh.repository;

import com.yugioh.model.Deck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeckRepository  extends JpaRepository<Deck, String> {
}
