
import java.util.Scanner;

// Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
// exemplo.
public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Digite um numero inteiro positivo.");
        } else {
            for (int i = 1; i <= N; i++) {
                double quadrado = (int) Math.pow(i, 2);
                double cubo = (int) Math.pow(i, 3);
                System.out.printf("%d %.0f %.0f %n", i, quadrado, cubo);
            }
        }
    }
}
