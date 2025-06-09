
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vect; // declarando o vetor

        if (N > 10){
            System.out.println("Digite um numero menor que 10");
            N = sc.nextInt();
        } //checando se é maior que 10 ou nao

        vect = new double[N]; // declarando o tamanho do vetor

        System.out.println("Digite os numeros:");
        for ( int i=0; i < N; i++){
            vect[i] = sc.nextDouble(); // lendo N numeros
        }

        for (int i=0; i < N; i++){
            if ( vect[i] < 0){
                System.out.println(vect[i]);
            }

        }










    }
}
