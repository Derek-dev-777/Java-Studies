import java.util.Scanner;

public class Program8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int N = sc.nextInt();
        int[] vetor = new int[N];

        double soma = 0;
        int index = 0;
        double media = 0;

        for ( int i = 0; i < N; i++) {
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                index++;
            }

        }
        media = soma / index;
        if (index == 0) {
            System.out.printf("Media dos pares: %.1f%n", media);
        }
        else{
            System.out.println("Nao tem numeros pares:");
        }





        }

    }

