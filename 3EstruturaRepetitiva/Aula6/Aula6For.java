
import java.util.Scanner;

public class Aula6For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que serão digitados");
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numero a ser somado");
            int x = sc.nextInt();
            soma += x;

        }

        System.out.println(soma);

        sc.close();
    }
}
