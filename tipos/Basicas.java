package tipos;

import java.util.Scanner;
import questoes.Temperatura;
import questoes.Numero;
import questoes.ParImpar;
import questoes.Soma;
import questoes.Tabuada;

public class Basicas extends Questoes {

    public static void main(String[] args) {

        System.out.println("Questões de Programação");
        System.out.println("--------------------------------");

        questao1(Questoes.scanner);
        questao2(Questoes.scanner);
        questao3(Questoes.scanner);
        questao4(Questoes.scanner);
        questao5(Questoes.scanner);
    }

    public static void questao5(Scanner scanner) {
        System.out.println("Tabuada: Mostre a tabuada de um número digitado pelo usuário. Default: 5");
        System.out.println(Tabuada.validar(5));
    }

    public static void questao4(Scanner scanner) {
        System.out.println("Soma de N números: Peça ao usuário quantos números ele quer somar e mostre o total no final. Default: 1, 2, 3, 4, 5, 6");
        float[] numeros = {1, 2, 3, 4, 5, 6};
        System.out.println(Soma.validar(numeros));
    }

    public static void questao3(Scanner scanner) {
        System.out.println("Conversão de temperatura: Peça a temperatura em Celsius e converta para Fahrenheit. Default: 21");
        System.out.println(Temperatura.validar(21f));
    }

    public static void questao2(Scanner scanner) {
        System.out.println("Maior de dois números: Leia dois números e mostre qual é o maior (ou se são iguais). Default: 6 e 3");
        System.out.println(Numero.validar(6, 3));
    }

    public static void questao1(Scanner scanner) {
        System.out.println("Par ou Ímpar: Escreve um programa que leia um número e diga se ele é par ou ímpar. Default: 5");
        System.out.println(ParImpar.validar(5));
    }
}
