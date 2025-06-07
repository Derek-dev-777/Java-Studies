
import java.util.Scanner;

public class Aula7DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite um valor em Celsius");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("O valor de %.1f em farenheint é: %.1f%n", C, F);
            System.out.println("Deseja repetir? (s/n):");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
    }
}
