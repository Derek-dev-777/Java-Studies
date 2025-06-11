package Application;

import java.util.Scanner;
import Entities.Pessoa;

public class Program3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tanto de pessoas a ser analisadas");
        int N = sc.nextInt();
        double soma = 0.0;
        Pessoa[] vetor = new Pessoa[N];

        for ( int i = 0; i < N ; i++){
            System.out.printf("Dados da %d° Pessoa%n", i);
            System.out.println("Digite o nome, idade e altura da pessoa: ");
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();

            soma += altura;
            vetor[i] = new Pessoa(nome,idade,altura);
        }



        double alturaMedia = soma / N;
        int contMenor16 = 0;
        System.out.printf("Altura media: %.2f%n", alturaMedia);

        for ( int i = 0; i < N ; i++){
            if ( vetor[i].getIdade() < 16){
                System.out.printf("%s tem menos de 16 anos%n", vetor[i].getNome());
                contMenor16++;
            }
        }
        double percentage = ((double) contMenor16 / N) * 100.0;
        System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n", percentage);







    }
}
