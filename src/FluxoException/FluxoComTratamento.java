package FluxoException;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
        metodo1();
        }catch(Exception exception){
                String msg = exception.getMessage();
                exception.printStackTrace();
                System.out.println(msg);
            }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws Minhaexcecao {
        System.out.println("Ini do metodo1");
        
        metodo2();
       
            System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws Minhaexcecao {
        System.out.println("Ini do metodo2");

       //ArithmeticException excption = new ArithmeticException("deu errado 2");
       throw new Minhaexcecao("deu errado 2");

      //    System.out.println("Fim do metodo2");
    }
}