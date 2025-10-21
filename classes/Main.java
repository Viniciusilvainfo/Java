package classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    int gols = 0; //32 bits
    byte nivel = 127; // -128 a 127, 8 bits
    short pontos = 32767; // -32.768 a 32.767, 16 bits 
    long populacao = 2147483647L; // maior que int, 64 bits

    float valor = 3.14f; // precisão simples de 32 bits (poucos números depois da vírgula)
    double frete = 2.5; //precisão dupla de 64 bits (mais números depois da vírgula)

    String clube = "Seleção Brasileira"; //tem que ser aspas duplas, não é tipo primitivo é um objeto (tipo por referência)
    char serie = 'A'; //tem que ser aspas simples, 16 bits (Unicode)

    Double altura = 1.75; //objeto do tipo Double (tipo por referência)
    Integer idade = 30; //objeto do tipo Integer (tipo por referência)

    boolean campeao = false;

    public static void main(String[] args) {
        Restaurante restaurante = new Pizzaria();

        restaurante.pedirComida("Pizza de Calabresa");

        Carro carro = new Carro("BYD");

        //tipos primitivos: int, float, double, char, boolean
        var jogador = "Neymar";

        if (jogador.equals("Neymar") == false) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (jogador.contains("Ney")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (jogador.startsWith("Ney")) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (jogador.isBlank()) {
            System.out.println("Verdadeiro");
        } else if (true) {
            System.out.println("Falso");
        }

        // this.funcaoDeVetores();
        // this.funcaoDeLoops();
        // this.funcaoDeArrayList(this.clube);
        // this.funcaoDeCasting();
    }

    private void funcaoDeCasting() {
        double salarioDouble = 1920.50;
        int salarioInt = (int) salarioDouble; //casting explícito de double para int

        System.out.println("Salário em double: " + salarioDouble);
        System.out.println("Salário em int: " + salarioInt);

        int idadeInt = 25;
        double idadeDouble = idadeInt; //casting implícito de int para double

        System.out.println("Idade em int: " + idadeInt);
        System.out.println("Idade em double: " + idadeDouble);

        String numeroString = "100";
        int numeroInt = Integer.parseInt(numeroString); //conversão de String para int
        String minhaSting = String.valueOf(numeroInt); //conversão de int para String

        System.out.println("Número em String: " + numeroString);
    }

    private void funcaoDeLoops() {
        ArrayList<String> times = new ArrayList<>();

        times.add("Vasco");
        times.add("Flamengo");

        for (int i = 0; i < times.size(); i++) { //enquanto tal condição não é atinginda
            System.out.println("Número: " + i);
        }

        for (String time : times) {
            System.out.println("Time: " + time);
        }

        while (true) { //até que uma condição seja atingida
            System.out.println("Loop infinito");
            break;
        }
    }

    protected void funcaoDeVetores() {
        int[] casas = {1, 2, 3, 4, 5}; //posições começam com zero, desse jeito o tamanho é fixo
        int[] pontos = new int[5];

        // pode ser criado arrays de tipos primitivos e de objetos
        String[] nomes = {"Ana", "Bia", "Carlos"};
        String[] vetorDeTimes = new String[10]; //tamanho fixo
        boolean[] respostas = {true, false, true, true};
        char[] letras = {'A', 'B', 'C'};
        float[] precos = {2.5f, 3.0f, 4.75f};

        HashMap<String, Integer> idade = new HashMap<>();
        idade.put("Ana", 20);
    }

    private void funcaoDeArrayList(String clube) {
        ArrayList<String> times = new ArrayList<>(); // lista dinâmica, pode crescer e diminuir de tamanho, tem que importar java.util.ArrayList

        times.add(clube); //adiciona elementos no fim do array
        times.add("Flamengo");
        times.add("Vasco");
        times.remove(0); // remove um elemento pelo índice

        System.out.println(times.get(0));
    }
}
