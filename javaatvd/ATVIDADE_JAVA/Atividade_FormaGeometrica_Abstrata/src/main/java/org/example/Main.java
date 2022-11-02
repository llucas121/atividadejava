package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica formaGeometrica1 = new Quadrado(2);
        FormaGeometrica formaGeometrica2 = new Circulo(5);

        ArrayList<FormaGeometrica> fgs = new ArrayList<>();
        fgs.add(formaGeometrica1);fgs.add(formaGeometrica2);

        for(FormaGeometrica fg : fgs){
            System.out.println(fg.area());
            System.out.println(fg.comprimento());
        }
    }
}