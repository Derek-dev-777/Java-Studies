import java.util.Scanner;

public class Program5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int N = sc.nextInt();

        double[] vetor = new double[N];

        for(int i=0; i < N; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        double aux = 0;
        int index = 0;
        for( int i=0; i< N; i++){
            if (vetor[i] > aux){
                aux = vetor[i];
                index = i;
            }
        }

        System.out.printf("Maior valor: %.2f", aux);
        System.out.printf("Posição no vetor: %d", index);

    }
}
