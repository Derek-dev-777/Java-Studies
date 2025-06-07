
import java.util.Scanner;

// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
public class Exercicio2Aula5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("O ponto pertence ao bloco Q1");
            } else if (x > 0 && y < 0) {
                System.out.println("O ponto pertence ao bloco Q4");
            } else if (x < 0 && y > 0) {
                System.out.println("O ponto pertence ao bloco Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("O ponto pertence ao bloco Q3");
            } else {
                System.out.println("O ponto esta na origem do plano cartesiano");
            }
        }

    }
}
