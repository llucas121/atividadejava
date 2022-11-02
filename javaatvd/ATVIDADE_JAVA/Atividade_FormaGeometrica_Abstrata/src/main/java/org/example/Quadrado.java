package org.example;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(){
        this.lado = 2;
    }
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double comprimento() {
        return lado*4;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
