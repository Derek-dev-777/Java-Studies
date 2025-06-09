import java.util.Scanner;

public class Program7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int N = sc.nextInt();
        double[] vetor = new double[N];

        double soma = 0;

        for ( int i = 0; i < N; i++){
            System.out.println("Digite um numero:");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        double media = soma / N;

        System.out.printf("%.1f",media);
        System.out.println("Numeros abaixo da media:");

        for ( int i = 0; i < N; i++){
            if(vetor[i] < media){
                System.out.printf("%.3f",vetor[i]);
            }

        }
    }
}
