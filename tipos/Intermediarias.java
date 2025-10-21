package tipos;

import java.util.Scanner;

import questoes.Numero;
import questoes.Soma;

public class Intermediarias extends Questoes {

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
        System.out.println("Fibonacci: Mostre os primeiros N termos da sequência de Fibonacci.");
        System.out.println(Numero.montarFibonacci(11));
    }

    public static void questao4(Scanner scanner) {
        System.out.println("Inversão de número: Receba um número inteiro (ex: 1234) e mostre ele invertido (4321).");
        System.out.println(Numero.inverter(1234));
    }

    public static void questao3(Scanner scanner) {
        System.out.println("Soma de pares e ímpares: Peça 10 números e mostre a soma dos pares e dos ímpares separadamente.");
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Soma.somarParesImpares(numeros));
    }

    public static void questao2(Scanner scanner) {
        System.out.println("Fatorial: Calcule o fatorial de um número (ex: 5! = 120).");
        System.out.println(Numero.calcularFatorial(5));
    }

    public static void questao1(Scanner scanner) {
        System.out.println("Números primos: Verifique se um número é primo. Default: 22");
        System.out.println(Numero.validarSePrimo(22));
    }

}
