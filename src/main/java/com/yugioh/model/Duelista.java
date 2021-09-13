package com.yugioh.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Duelista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "duelista_id", nullable = false)
    private Long duelistaId;

    private String nome;

    @ManyToOne
    private Mao maos;

    @ManyToOne
    private Deck deck;
    boolean status; // Se está duelando ou não
    int idPartida; // Teste para possibilitar multisjogador
}
