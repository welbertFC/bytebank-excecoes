package br.com.bytebank.Bank.Models;

public class GuardadorDecontas {

    private Conta[] referencias;
    private  int porsicaoLivre;

    public GuardadorDecontas(){
        this.referencias = new Conta[10];
        this.porsicaoLivre = 0;
    }

    public void adiciona(Conta ref){
        this.referencias[this.porsicaoLivre] = ref;
        this.porsicaoLivre++;

    }

    public int getQuardadorDeElementos(){

        return this.porsicaoLivre;
    }

    public  Conta getReferencia(int pos){
        return this.referencias[pos];
    }
}
