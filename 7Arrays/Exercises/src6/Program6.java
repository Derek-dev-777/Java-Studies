import java.util.Scanner;

public class Program6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho dos vetores: ");
        int N = sc.nextInt();

        double[] A = new double[N];
        double[] B = new double[N];
        double[] C = new double[N];
        double soma = 0;

        for( int i = 0; i < N; i++){
            System.out.println("Digite os valores do vetor A:");
            A[i] = sc.nextDouble();
        }

        for( int i = 0; i < N; i++){
            System.out.println("Digite os valores do vetor B:");
            B[i] = sc.nextDouble();
        }

        System.out.println("Vetores resultantes: ");
        for( int i = 0; i < N; i++){
            C[i] = A[i] + B[i];
            System.out.println(C[i]);

        }

    }
}
