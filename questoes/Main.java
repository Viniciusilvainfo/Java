package questoes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Questões de Programação");

        System.out.println("--------------------------------");

        Main.questao1(scanner);

    }

    public static void questao1(Scanner scanner) {
        System.out.println("Par ou Ímpar: Escreve um programa que leia um número e diga se ele é par ou ímpar.");
        System.out.print("Digite um número inteiro: ");

        int numero = 5; //scanner.nextInt();
        System.out.println(ParImpar.validar(numero));
    }
}
