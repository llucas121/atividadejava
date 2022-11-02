package org.example;

public class Gerente extends Funcionario{
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()*1.1);
    }
}
