package Conexao;

public class TesteConexao {

    public static void main(String[] args) {


        try (Conexao conexao = new Conexao() ) {
            conexao.leDados();
        }catch (Exception ex){
            System.out.println("erro na conexão");
        }


//        try {
//            conexao = new Conexao();
//            conexao.leDados();
//
//        }catch (Exception e){
//            System.out.println("Deu Erro na Conexao ");
//        }finally {
//            conexao.fecha();
//        }
//    }
    }
}