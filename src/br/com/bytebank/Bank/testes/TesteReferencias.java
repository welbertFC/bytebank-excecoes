package br.com.bytebank.Bank.testes;

import br.com.bytebank.Bank.Models.Cliente;
import br.com.bytebank.Bank.Models.ContaCorrente;
import br.com.bytebank.Bank.Models.ContaPoupanca;

public class TesteReferencias {
	public static void main(String[] args) {
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		Object cc = new ContaCorrente(22,33, 123, null);
		Object cp = new ContaPoupanca(33,22, 123 , null);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		println(cc);
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Object referencia) {}
}
