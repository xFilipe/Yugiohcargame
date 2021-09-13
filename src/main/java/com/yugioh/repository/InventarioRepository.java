package com.yugioh.repository;

import com.yugioh.model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, String> {
}
