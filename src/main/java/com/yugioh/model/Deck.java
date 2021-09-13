package com.yugioh.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter // Temporário
@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deck_id", nullable = false)
    private Long deckId;

    private String nome;

    @OneToMany
    List<Carta> deckCartas = new ArrayList<Carta>(39);

    private void criarDeck(String deckId){

        // Criar lógica buscando o deck de acordo com o deckId no banco de dados.
    }

    public Carta sacar(){
        Carta c = deckCartas.get(0);
        deckCartas.remove(0);
        return c;
    }

    private boolean adicionarDeck(Carta c){
        if(deckCartas.size() < 39) {
            deckCartas.add(c);
            return true;
        } else {
            return false;
        }
    }

    private void embaralhar(){
        Collections.shuffle(deckCartas);
    }





}
