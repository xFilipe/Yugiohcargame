package com.yugioh.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
public class Arena {
    @Id
    @Column(name = "arena_id", nullable = false)
    private Long arenaId;

    private String tipoCampo; // Possibilitar bônus de campo

    // Player 1
    private int pontoVida1;

    @OneToMany
    private List<Carta> areaMonstro1 = new ArrayList<Carta>(4);

    @OneToMany
    private List<Carta> areaMagia1 = new ArrayList<Carta>(4);

    @OneToMany
    private List<Carta> cemiterio1 = new ArrayList<Carta>();


    // Player 2
    private int pontoVida2;

    @OneToMany
    private List<Carta> areaMonstro2 = new ArrayList<Carta>(4);

    @OneToMany
    private List<Carta> areaMagia2 = new ArrayList<Carta>(4);

    @OneToMany
    private List<Carta> cemiterio2 = new ArrayList<Carta>();



}
