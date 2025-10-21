package questoes;

public class Temperatura {

    public static String validar(float temperatura) {
        float fahrenheit = (temperatura * 1.8f) + 32f;

        return "A temperatura de " + temperatura + " Celsius é igual a " + fahrenheit + " Fahrenheit!";

    }

}
