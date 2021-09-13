package com.yugioh.repository;

import com.yugioh.model.Arena;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArenaRepository  extends JpaRepository<Arena, Long> {
}
