
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
public class Exercicio5Aula2 {

    public static void main(String[] args) {

        // Declaração de variaveis
        int codigoP1, qtdP1, codigoP2, qtdP2;
        double valorP1, valorP2, valorFinal;

        Scanner sc = new Scanner(System.in);

        // Coletando codigo das peças
        System.out.println("Digite o codigo da peça 1 e peça 2:");
        codigoP1 = sc.nextInt();
        codigoP2 = sc.nextInt();

        // Coletando a quantidade de peças compradas
        System.out.println("Digite a quantidade de peças 1 e peças 2:");
        qtdP1 = sc.nextInt();
        qtdP2 = sc.nextInt();

        // Coletando o valor das peças
        System.out.println("Agora digite o valor das peças 1 e peças 2:");
        valorP1 = sc.nextDouble();
        valorP2 = sc.nextDouble();

        // Fazendo a conta do valor final
        valorFinal = (valorP1 * qtdP1) + (valorP2 * qtdP2);

        // Exibindo valor final
        System.out.printf("O valor a ser pago é de: %.2f", valorFinal);

    }
}
