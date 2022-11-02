package org.example;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public abstract void aumentoSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: "+getNome()+" Salario: "+getSalario();
    }
}
