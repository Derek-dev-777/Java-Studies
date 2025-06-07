
import java.util.Scanner;

public class Aula9Funçao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros e vamos encontrar o maior entre eles");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int higher = max(A, B, C);

        System.out.printf("O maior numero é %d", higher);
    }

    // Função para checar qual numero é o maior entre 3
    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;

    }
}
