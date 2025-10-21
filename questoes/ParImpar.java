package questoes;

public class ParImpar {

    public static String validar(int numero) {
        String resultado = "";

        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        return resultado;
    }
}
