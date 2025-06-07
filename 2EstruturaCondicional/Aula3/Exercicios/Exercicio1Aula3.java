
import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
public class Exercicio1Aula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é positivo");
        }

        sc.close();
    }
}
