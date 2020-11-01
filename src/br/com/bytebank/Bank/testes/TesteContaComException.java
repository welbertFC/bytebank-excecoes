package br.com.bytebank.Bank.testes;


import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.SaldoInsuficienteException;


public class TesteContaComException {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(0,123,123,null);

        contaCorrente.depositar(220);


        try {
            contaCorrente.sacar(300);

        }catch (SaldoInsuficienteException exception){

            System.out.println(exception.getMessage());

        }
        System.out.println(contaCorrente.getSaldo());

    }
}
