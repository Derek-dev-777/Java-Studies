
import java.util.Scanner;

// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
// peso 5.
public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de teste que deve ser realizado");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Digite as 3 notas desejadas:");
            System.out.println("a nota A tem peso 2, B tem peso 3, C tem peso 5");

            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();
            double media = ((A * 2) + (B * 3) + (C * 5)) / 10;

            System.out.printf("A media das notas do teste %d, é de: %.1f", i, media);

        }
    }
}
