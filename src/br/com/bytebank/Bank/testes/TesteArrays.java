package br.com.bytebank.Bank.testes;

import br.com.bytebank.Bank.Models.Conta;
import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.GuardadorDecontas;

public class TesteArrays {

    public static void main(String[] args) {

        GuardadorDecontas guardadorDecontas = new GuardadorDecontas();

        ContaCorrente conta1 = new ContaCorrente(120,123,123,null);
        guardadorDecontas.adiciona(conta1);

        ContaCorrente conta2 = new ContaCorrente(120,123,123,null);
        guardadorDecontas.adiciona(conta2);

        int tamanho = guardadorDecontas.getQuardadorDeElementos();
        System.out.println(tamanho);

        Conta ref = guardadorDecontas.getReferencia(0);
        System.out.println(ref.getNumero());





    }


}
