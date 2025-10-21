package questoes;

public class Soma {

    public static String validar(float[] numeros) {
        float resultado = 0;

        for (float numero : numeros) {
            resultado += numero;
        }

        return "A soma dos valores informado é " + String.format("%.2f", resultado);

    }

    public static String somarParesImpares(int[] numeros) {
        int pares = 0;
        int impares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares += numero;
            } else {
                impares += numero;
            }
        }

        return "A soma dos números pares é igual a " + pares + " e a soma dos números ímpares é igual a " + impares;
    }

}
