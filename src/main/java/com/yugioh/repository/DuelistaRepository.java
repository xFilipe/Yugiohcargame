package com.yugioh.repository;

import com.yugioh.model.Duelista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuelistaRepository  extends JpaRepository<Duelista, String> {
}
