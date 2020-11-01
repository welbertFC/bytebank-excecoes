package br.com.bytebank.Bank.Models;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
