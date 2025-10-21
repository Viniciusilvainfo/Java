package questoes;

public class Tabuada {

    public static String validar(int numero) {
        String tabuada = "";

        for (int c = 1; c <= 10; c++) {
            tabuada += numero + " X " + c + " = " + numero * c + " \n";
        }

        return tabuada;
    }

}
