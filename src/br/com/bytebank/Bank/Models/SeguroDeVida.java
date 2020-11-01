package br.com.bytebank.Bank.Models;

public class SeguroDeVida implements Tributavel{

    private double saldo;
    private CalculaImposto calculaImposto;

    public SeguroDeVida(){
        this.calculaImposto = new CalculaImposto();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void valorImposto(double saldo) {
        this.calculaImposto.calculador(saldo);

    }

    @Override
    public double getValorImposto() {
        return 42;
    }
}
