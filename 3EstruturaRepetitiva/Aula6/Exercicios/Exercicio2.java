
import java.util.Scanner;

// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que serão lidos");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= N; i++) {

            N = sc.nextInt();

            if (N >= 10 && N <= 20) {
                in += 1;
            } else {
                out += 1;
            }

        }

        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);

    }
}
