package questoes;

public class Numero {

    public static int validar(int numero1, int numero2) {
        int resultado;

        if (numero1 >= numero2) {
            resultado = numero1;
        } else {
            resultado = numero2;
        }

        return resultado;
    }

    public static String calcularFatorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado += (resultado * i);
        }

        return "O fatorial de " + numero + " é igual a " + resultado;
    }

    public static String validarSePrimo(int numero) {

        if (numero < 2) {
            return "Não é um número primo";
        }

        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return "Não é um número primo";
            }
        }

        return "É um número primo";
    }

    public static int inverter(int numero) {
        String resultado = "";

        String numeroString = Integer.toString(numero);

        for (int i = numeroString.length(); i > 0; i--) {
            resultado += numeroString.substring((i - 1), (i));
        }

        return Integer.parseInt(resultado);
    }

    public static String montarFibonacci(int quantidade) {
        String resultado = "1";
        int numeroInicial = 1;
        int anterior = 0;

        for (int i = 1; i < quantidade; i++) {
            int result = anterior + numeroInicial;

            resultado += ", " + (result);

            anterior = numeroInicial;
            numeroInicial = result;
        }

        return resultado;
    }

}
