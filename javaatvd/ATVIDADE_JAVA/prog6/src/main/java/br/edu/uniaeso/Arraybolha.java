package br.edu.uniaeso;

public class Arraybolha {
    private int limite;//determina o tamanho maximo do array
    private double[] a;//cria a array do tipo double(com casas decimais)
    private int nElems;//conta quanto elementos temos ate o momento

    public Arraybolha(int max){//construtor do array com limite
        limite = max;
        a = new double[limite];
        nElems = 0;//inicia vazio
    }
    public Arraybolha(){//construtor padrao do array com limite 10
        limite = 10;
        a = new double[limite];
        nElems = 0;//inicia vazio
    }

    public void insere(double value){
        if(nElems<=limite){//verifica se ainda tem espaco para insercao
            a[nElems] = value;//insire o dado
            nElems++;//contabiliza a insercao
        }else{//mensagem caso nao tenha espaco
            System.out.println("Limite atingido!!!");
        }
    }

    public void mostra(){//mostra todos os dados inseridos
        for(int x=0;x<nElems;x++){
            System.out.println(a[x]+" ");
        }
        System.out.println(" ");
    }

    public void bolha(){//ordena pelo metodo bolha(bubble sort)
        int out, in;//auxiliares
        for(out = nElems-1; out>1; out--){
            for(in=0; in<out; in++){
                if(a[in] > a[in+1]){
                    troca(in,in+1);
                }
            }
        }
    }

    private void troca(int um, int dois){//faz a troca com o uso de auxiliar
        double temp = a[um];
        a[um] = a[dois];
        a[dois] = temp;
    }
}
