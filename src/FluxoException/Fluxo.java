package FluxoException;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
        metodo1();
        }catch(ArithmeticException  exception){
                String msg = exception.getMessage();
                System.out.println("erro aritimetico" + msg);
                //exception.printStackTrace();
            }catch(NullPointerException exception){
            System.out.println("erro de nullpointer");
        }


        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        
        metodo2();
       
            System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = 1 /0;

            
        }
        System.out.println("Fim do metodo2");
    }
}