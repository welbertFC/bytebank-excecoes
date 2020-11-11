package br.com.bytebank.Bank.testes.util;

import br.com.bytebank.Bank.Models.Cliente;
import br.com.bytebank.Bank.Models.Conta;
import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class Teste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33,123, null);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44, 9898, null);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11, 215, null);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22, 789, null);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        lista.forEach((Conta conta) ->  System.out.println(conta + conta.getTitular().getNome()));



        System.out.println("----------------------------------------");





        Comparator<Conta> comp = (Conta c1, Conta c2) ->{
            return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
        };

        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        lista.forEach((conta) -> System.out.println(conta + conta.getTitular().getNome()));



    }
}















