package br.com.bytebank.Bank.testes;

import br.com.bytebank.Bank.Models.Cliente;
import br.com.bytebank.Bank.Models.Conta;
import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(200,123,321,null);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(100,321,1234,null);
		referencias[1] = cc2;	
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println( referenciaGenerica.getNumero()  );
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
