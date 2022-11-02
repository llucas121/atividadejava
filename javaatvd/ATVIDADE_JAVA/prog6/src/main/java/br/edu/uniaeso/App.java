package br.edu.uniaeso;

public class App
{
    public static void main( String[] args )
    {
        Arraybolha arr = new Arraybolha(5);
        arr.insere(55.1);
        arr.insere(77);
        arr.insere(33);
        arr.insere(44);
        arr.insere(55.2);
        arr.mostra();
        arr.bolha();
        arr.mostra();
    }
}