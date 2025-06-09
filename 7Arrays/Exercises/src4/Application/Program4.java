package Application;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros a ser analisado:");
        int N = sc.nextInt();
        int[] vetor = new int[N];

        for (int i = 0; i< N; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int parContador = 0;
        for (int i = 0; i< N; i++){
            if ( vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
                parContador++;
            }
        }
        System.out.printf("Numero de pares: %d", parContador);

    }
}
