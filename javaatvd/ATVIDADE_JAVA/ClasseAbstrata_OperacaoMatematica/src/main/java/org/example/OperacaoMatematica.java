package org.example;

public abstract class OperacaoMatematica {

    private double valor1,valor2;
    public abstract double calcula();

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "Valor 1: "+getValor1()+" Valor 2: "+getValor2()+" Resultado do calculo: "+calcula();
    }
}
