public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, int agencia, int numero, Cliente titular) {
        super(saldo, agencia, numero, titular);
    }

    @Override
    public void depositar(double valor) {

        if(valor <= 0){
            System.out.println("não é possivel depositar valor menor que 1");
        }else {

            this.saldo = this.saldo + valor;
        }

    }


}
