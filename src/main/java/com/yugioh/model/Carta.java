package com.yugioh.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter // Temporário
@Entity
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nome;
    // private Tipo tipo;
    private int ataque;
    private int defesa;
    // private Efeito efeito;
    private String descricao;
    private boolean status = false; // Verifica se a carta está em jogo.

}
