package org.example;

public class Circulo extends FormaGeometrica{
    private double raio;
    public static final double PI = 3.14;

    public Circulo(){
        this.raio = 2;
    }
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double area() {
        return raio*raio*PI;
    }
    @Override
    public double comprimento() {
        return 2*PI*raio;
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
