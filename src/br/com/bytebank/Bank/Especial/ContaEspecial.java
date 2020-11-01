package br.com.bytebank.Bank.Especial;

import br.com.bytebank.Bank.Models.Cliente;
import br.com.bytebank.Bank.Models.Conta;

public class ContaEspecial extends Conta {

    public ContaEspecial(double saldo, int agencia, int numero, Cliente titular) {
        super(saldo, agencia, numero, titular);
    }

    @Override
    public void depositar(double valor) {

    }
}
