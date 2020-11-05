package br.com.bytebank.Bank.testes;

public class Teste {

    //Array[]

    public static void main(String[] args) {

        int idades [] = new int[5];//inicializa com 0

        for(int i = 1; i < idades.length; i++){
            idades[i] = i;
            System.out.println(idades[i]);
        }

        

       

        idades[0] = 29;
        idades[1] = 30;
        idades[2] = 40;
        idades[3] = 35;
        idades[4] = 15;

          int valor = idades[3];

       System.out.println(idades.length);

    }
    
}