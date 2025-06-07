
import java.util.Scanner;

// Ler um número inteiro N e calcular todos os seus divisores
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para encontrar seus divisores");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i);
            }

        }
    }
}
