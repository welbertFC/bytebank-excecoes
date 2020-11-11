package br.com.bytebank.Bank.Models;

public class ContaCorrente extends Conta implements Tributavel {

    private CalculaImposto calculaImposto;

    public ContaCorrente(double saldo, int agencia, int numero, Cliente titular) {
        super(saldo,agencia,numero,titular);
        this.calculaImposto = new CalculaImposto();
    }

    @Override
    public void depositar(double valor) {

        if(valor <= 0){
            System.out.println("não é possivel depositar valor menor que 1");
        }else {

            this.saldo = this.saldo + valor;
        }

    }


    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        super.sacar(valor + 0.2);
    }

    @Override
    public void valorImposto(double saldo) {
    this.calculaImposto.calculador(getSaldo());

    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.20;
    }




}


