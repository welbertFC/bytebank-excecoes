package FluxoException;

public class TesteContaComExceptionChekd {

    public static void main(String[] args) {

        ContaExeception c = new ContaExeception();
        try {
            c.deposita();
        }catch (Minhaexcecao minhaexcecao){

            System.out.println("tratamento da exception");
        }


    }
}
