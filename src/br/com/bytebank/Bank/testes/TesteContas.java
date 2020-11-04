package br.com.bytebank.Bank.testes;


import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.ContaPoupanca;
import br.com.bytebank.Bank.Models.SaldoInsuficienteException;


//br.com.bytebank.Bank.testes.TesteContas
public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente contaCorrente = new ContaCorrente(0,321,123,null);
        contaCorrente.depositar(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(0,31,123, null);
        contaPoupanca.depositar(200 );

        contaCorrente.transfere(20,contaPoupanca);

        System.out.println("br.com.bytebank.Bank.Models.Conta poupança " + contaPoupanca.getSaldo());
        System.out.println("br.com.bytebank.Bank.Models.Conta Corrente " + contaCorrente.getSaldo());

        contaCorrente.transfere(20,contaPoupanca);
    }
}
