
import java.util.Scanner;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
public class Exercicio3Aula2 {

    public static void main(String[] args) {

        // Declaração de variaveis
        int A, B, C, D, diferenca;

        // Criação de scanner 
        Scanner sc = new Scanner(System.in);

        // Coletando os dados informados pelo usuario
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        // Formula
        diferenca = (A * B) - (C * D);

        System.out.printf("A diferença é de %d", diferenca);

    }
}
