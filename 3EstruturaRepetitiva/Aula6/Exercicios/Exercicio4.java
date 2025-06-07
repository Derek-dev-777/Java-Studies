
import java.util.Scanner;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de testes desejados: ");
        int N = sc.nextInt();
        double x, y;

        for (int i = 0; i < N; i++) {

            System.out.println("Digite o primeiro numero:");
            x = sc.nextDouble();
            System.out.println("Digite o segundo numero:");
            y = sc.nextDouble();

            if (y != 0) {
                System.out.printf("%.1f%n", x / y);
            } else {
                System.out.println("Divisão impossivel de fazer");
            }

        }

    }
}
