package br.com.bytebank.Bank.testes.util;

import java.util.ArrayList;

public class TesteWrappers {

    public static void main(String[] args) {
        int[] idades = new int[5];

        String[] nomes = new String[10];

        int idade = 29;

        Integer idaderd = 29;

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

        String numero = "10";

        Integer numero10 = Integer.parseInt(numero);


        System.out.println(numero10);
        System.out.println(numero10.doubleValue());




    }
}
