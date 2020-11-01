package br.com.bytebank.Bank.Models;

public class   CalculaImposto {

    private  double totalImposto;

    public void calculador(double saldo){

        double imposto = saldo * 0.1;
        System.out.println("seu imposto sobre o saldo é de " + imposto);
        System.out.println("seu saldo total é de " + (saldo - imposto));

    }

    public void registra(Tributavel tributavel){
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;

    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
