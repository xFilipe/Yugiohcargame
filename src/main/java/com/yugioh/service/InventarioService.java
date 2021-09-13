package com.yugioh.service;

import com.yugioh.model.Inventario;

import java.util.List;

public interface InventarioService {

    List<Inventario> findAll();

    Inventario findById(long id);

    Inventario save(Inventario inventario);
}
