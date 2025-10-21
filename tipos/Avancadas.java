package tipos;

import java.util.Scanner;

import questoes.Numero;

public class Avancadas extends Questoes {

    public static void main(String[] args) {

        System.out.println("Questões de Programação");
        System.out.println("--------------------------------");

        questao1(Questoes.scanner);

    }

    public static void questao1(Scanner scanner) {
        System.out.println("Fibonacci: Mostre os primeiros N termos da sequência de Fibonacci.");
        System.out.println(Numero.montarFibonacci(11));
    }

}
