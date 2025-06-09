import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int N = sc.nextInt();
        double[] vect = new double[N];

        double soma = 0.00;
        double media = 0.00;

        for (int i=0;i<N;i++){
            System.out.println("Digite o numero:");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }
        media = soma / N;

        for (int i= 0; i < N; i++){
            System.out.println("Valores" + vect[i]);
        }
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

    }
}
