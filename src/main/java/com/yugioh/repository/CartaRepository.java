package com.yugioh.repository;

import com.yugioh.model.Carta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaRepository  extends JpaRepository<Carta, String> {
}
