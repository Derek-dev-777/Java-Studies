import java.util.Scanner;

public class Arrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = 10;
        double[] vect = new double[x]; // declarando um vetor de tamanho x (10)

        for (int  i = 0; i<x; i++){
            vect[i] = sc.nextDouble(); // atribuindo valores ao vetor
        }
    }
}
