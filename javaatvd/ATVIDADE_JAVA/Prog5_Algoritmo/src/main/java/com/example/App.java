package com.example;
import java.util.Scanner;//importa o scanner

public class App 
{
    public static void main( String[] args )//funcao main
    {
        Aluno[] alunos = new Aluno[3];//criar vetor alunos
        Scanner entrada1 = new Scanner(System.in);
        for(int x=0;x<alunos.length; x++){//preenche os vetor com os dados do usuario
            alunos[x] = new Aluno();//cria um novo objeto aluno a cada iteracao
            System.out.println((x+1)+". pessoa: ");
            System.out.println("Nome: ");
            alunos[x].setNome(entrada1.nextLine());
            System.out.println("Celular: ");
            alunos[x].setCelular(entrada1.nextLine());
        }
        bubbleSort(alunos);//ordena pelo metodo bolha
        imprimirDados(alunos);//imprime os dados
    }

    public static void imprimirDados(Aluno[] alunos){//imprime os dados
        System.out.println("*** nomes ordenados ***");
        for(int x=0;x<alunos.length; x++){
            System.out.println(alunos[x]);
        }
    }

    public static void bubbleSort(Aluno[] alunos){
        Aluno auxiliar = new Aluno();//cria um objeto aluno para auxiliar na troca
        for(int x=0; x<alunos.length; x++){
            for(int y=x+1; y<alunos.length; y++){
                if(alunos[x].getNome().compareTo(alunos[y].getNome())>0){//compara se o nome do aluno vem depois do nome do proximo alun e troca caso verdade
                    auxiliar.setNome(alunos[x].getNome());
                    auxiliar.setCelular(alunos[y].getCelular());
                    alunos[x].setNome(alunos[y].getNome());
                    alunos[x].setCelular(alunos[y].getCelular());
                    alunos[y].setNome(auxiliar.getNome());
                    alunos[y].setCelular(auxiliar.getCelular());
                }
            }
        }
    }
}
