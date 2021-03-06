package br.com.bytebank.Bank.testes;


import br.com.bytebank.Bank.Models.CalculaImposto;
import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.SeguroDeVida;

public class TesteInterface {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(300,321,321,null);
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        seguroDeVida.setSaldo(100);

        CalculaImposto calculaImposto = new CalculaImposto();
        calculaImposto.registra(contaCorrente);
        calculaImposto.registra(seguroDeVida);

        contaCorrente.valorImposto(contaCorrente.getSaldo());
        seguroDeVida.valorImposto(seguroDeVida.getSaldo());

        System.out.println(calculaImposto.getTotalImposto());



    }
}
