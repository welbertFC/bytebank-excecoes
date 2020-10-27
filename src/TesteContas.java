public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(0,321,123,null);
        contaCorrente.depositar(100);

        ContaPoupanca contaPoupanca = new ContaPoupanca(0,31,123, null);
        contaPoupanca.depositar(200 );

        contaCorrente.transfere(20,contaPoupanca);

        System.out.println("Conta poupança " + contaPoupanca.getSaldo());
        System.out.println("Conta Corrente " + contaCorrente.getSaldo());

        contaCorrente.transfere(20,contaPoupanca);
    }
}
