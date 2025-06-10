package Application;

import java.util.Scanner;
import Entities.Pessoa1;

public class Program9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tanto de pessoas");
        int N = sc.nextInt();

        Pessoa1[] pessoas = new Pessoa1[N];

        for ( int i = 0; i < N; i++){
            System.out.printf("Digite o nome e a idade da %d° pessoa:%n", i);
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            pessoas[i] = new Pessoa1(nome, idade, altura);
        }
        int index = 0;

        for (int i = 0; i < N; i++){
            if (pessoas[i].getIdade() > index){
                index = pessoas[i].getIdade();
            }
        }

        for (int i = 0; i < N; i++){
            if (pessoas[i].getIdade() == index){
                System.out.printf("A pessoa mais velha é: %s%n",pessoas[i].getNome());
            }
        }


    }
}
