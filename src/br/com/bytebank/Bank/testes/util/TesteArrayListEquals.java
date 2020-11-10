package br.com.bytebank.Bank.testes.util;

import br.com.bytebank.Bank.Models.Conta;
import br.com.bytebank.Bank.Models.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(123,23,123,null);
//        Conta cc2 = new ContaCorrente(123,123,123,null);
//
//        System.out.println(cc1.ehigual(cc2));



        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente conta1 = new ContaCorrente(120, 123, 123, null);
        lista.add(conta1);

        ContaCorrente conta2 = new ContaCorrente(120, 123, 123, null);
        lista.add(conta2);

        ContaCorrente conta3 = new ContaCorrente(120, 789, 123, null);
        lista.add(conta3);

        ContaCorrente conta4 = new ContaCorrente(120, 789, 123, null);


        lista.contains(conta4);

        System.out.println(lista.contains(conta4));

        for(Conta conta : lista){
            if(conta == conta4 ){
                System.out.println("Ja tenho esta conta ");
            }
        }
    }

}
