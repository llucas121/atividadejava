package com.example;
public class Aluno {
    private String nome,celular;

    public Aluno(){
        this.nome = "Jose";
        this.celular = "4002-8922";
    }
    public Aluno(String nome, String celular){
        this.nome = nome;
        this.celular = celular;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setCelular(String celular){
        this.celular = celular;
    }
    public String getCelular(){
        return celular;
    }

    public String toString(){
        return "Nome: "+getNome()+" Celular: "+getCelular();
    }
}
