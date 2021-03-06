package br.com.bytebank.Bank.Models;

public abstract class Conta implements Comparable<Conta> {

    double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor Conta
     *
     * @param saldo
     * @param agencia
     * @param numero
     * @param titular
     */
    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        Conta.total++;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }




    public abstract void depositar(final double valor);

    /**
     * valor precisa ser maior que o saldo
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */

    public void sacar(final double valor) throws SaldoInsuficienteException {

        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo " + this.saldo + "valor " + valor);

        }else {
            this.saldo -= valor;
        }

        /*
        if (valor >= this.saldo) {
            System.out.println("Não possui saldo suficiente seu saldo é: " + saldo);
        } else {

            this.saldo = this.saldo - valor;
        }
        */
    }

    public boolean transfere(final double valor, final Conta destino) throws SaldoInsuficienteException {
        if (this.saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
            return true;
        } else {

            double saldoNescessario = valor - this.saldo;
            System.out
                    .println("saldo nescessario é de " + (saldoNescessario += saldo) + " Voce possui apenas " + saldo);
            return false;

        }

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {

        return this.numero;
    }

    public void setNumero(int numero) {

        if (numero < 0){
            System.out.println("Numero de conta não pode ser negativo");
            return;
        } else if(numero == 0){
            System.out.println("Numero de conta não pode ser 0");
            return;

        }else {
            this.numero = numero;
        }
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia < 0){
            System.out.println("Numero da agencia não pode ser negativo");
            return;
        } else if(agencia == 0){
            System.out.println("Numero da conta não pode ser 0");
            return;

        }else {
            this.agencia = agencia;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;

    }

    public  boolean equals(Object ref){
        Conta conta = (Conta) ref;
        if(this.agencia != conta.agencia || this.numero != conta.numero ){
            return false;
        }else
            return true;
    }

    @Override
    public String toString() {
    return "Numero da Conta " + getNumero() + " Agencia " + getAgencia() + " Saldo " + getSaldo();
    }

    @Override
    public int compareTo(Conta o) {

        return Double.compare(this.saldo, o.saldo);
    }
}