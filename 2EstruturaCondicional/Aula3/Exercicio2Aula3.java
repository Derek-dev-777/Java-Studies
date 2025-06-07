
import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class Exercicio2Aula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, restoDivisao;

        numero = sc.nextInt();
        restoDivisao = numero % 2;

        if (restoDivisao == 1) {
            System.out.println("O numero é impar");
        } else {
            System.out.println("O numero é par");
        }

        sc.close();

    }
}
