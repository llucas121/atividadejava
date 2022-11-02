package org.example;

public class Subtracao extends OperacaoMatematica{

    public Subtracao(double valor1, double valor2) {
        setValor1(valor1);
        setValor2(valor2);
    }

    public Subtracao(){
        setValor1(1);
        setValor2(2);
    }

    @Override
    public double calcula() {
        return (getValor1()-getValor2());
    }
}
