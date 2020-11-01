package Conexao ;

public class Conexao implements AutoCloseable {

    public Conexao(){
        System.out.println("abrindo conexão");
        throw new IllegalStateException();
    }

    public void leDados(){
        System.out.println("recebendo dados");
        throw new IllegalStateException();
    }


    @Override
    public void close() throws Exception {
        System.out.println("fechando conexao");

    }
}
