package br.com.bytebank.Bank.testes.util;

import br.com.bytebank.Bank.Models.Conta;
import br.com.bytebank.Bank.Models.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList <Conta> lista = new ArrayList<Conta>();

        ContaCorrente conta1 = new ContaCorrente(120,123,123,null);
        lista.add(conta1);

        ContaCorrente conta2 = new ContaCorrente(120,456,123,null);
        lista.add(conta2);

        ContaCorrente conta3 = new ContaCorrente(120,789,123,null);
        lista.add(conta3);

        ContaCorrente conta4 = new ContaCorrente(120,1112123,123,null);
        lista.add(conta4);


        System.out.println(lista.size());
        System.out.println(lista.get(0));

        lista.remove(1);

        System.out.println(lista.size());

        for(int i = 0; i <lista.size(); i++){
            System.out.println(lista.get(i));
        }

        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}
