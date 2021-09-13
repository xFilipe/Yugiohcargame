package com.yugioh.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@Setter
public class Inventario {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    Map<String, Carta> cartas = new HashMap<>();


    // Talvez possa haver algo mais aqui no futuro...


}
