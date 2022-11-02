package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica operacao1 = new Soma(1,4);
        OperacaoMatematica operacao2 = new Subtracao(2,6);
        OperacaoMatematica operacao3 = new Multiplicacao(5,5);
        OperacaoMatematica operacao4 = new Divisao(8,2);
        ArrayList<OperacaoMatematica> ListaOpercaoes = new ArrayList<>();

        ListaOpercaoes.add(operacao1);ListaOpercaoes.add(operacao2);ListaOpercaoes.add(operacao3);ListaOpercaoes.add(operacao4);

        for(OperacaoMatematica o : ListaOpercaoes){
            System.out.println(o);
        }
    }
}