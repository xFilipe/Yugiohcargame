package com.yugioh.model;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Jogo {

    private boolean status = false; // Verifica se o jogo está em andamento

    private Duelista duelista1;
    private Duelista duelista2;
    private Duelista jogadorAtual;
    private Arena arena;
    private long horaInicio;
    private long horaFim;
    private Duelista vencedor;



    private void comecar(String cara, String coroa){

        this.status = true;

        Date hora = new Date();
        horaInicio = hora.getTime();

        arena.setTipoCampo("0");
        arena.setPontoVida1(8000);
        arena.setPontoVida2(8000);

        arena.getAreaMonstro1().clear();
        arena.getAreaMonstro2().clear();

        arena.getAreaMagia1().clear();
        arena.getAreaMagia2().clear();


        // Sortear
        List<String> moeda = new ArrayList<>();
        moeda.add(cara);
        moeda.add(coroa);
        Collections.shuffle(moeda);
        String sorteado = (String) moeda.get(0);
        trocarturno(sorteado);

        duelista1.getDeck().sacar();
        duelista2.getDeck().sacar();

    }

    private void trocarturno(String id){
            if(id.equals(duelista1.getDuelistaId())){
                jogadorAtual = duelista2;
            } else {
                jogadorAtual = duelista1;
            }
    }

    private void encerrar(){
        status = false;
        if(arena.getPontoVida1() < arena.getPontoVida2()){
            vencedor = duelista2;
        } else {
            vencedor = duelista1;
        }

    }

}
