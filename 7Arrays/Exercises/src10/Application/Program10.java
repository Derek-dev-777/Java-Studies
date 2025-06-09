package Application;

import java.util.Scanner;
import Entities.Aluno;
public class Program10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o tanto de alunos:");
        int N = sc.nextInt();
        Aluno[] alunos = new Aluno[N];

        for( int i = 0; i < N; i++){
            System.out.println("Digite o nome e as notas do aluno:");
            sc.nextLine();
            String nome = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            alunos[i] = new Aluno(nome,nota1,nota2);


        }

        System.out.println("Alunos aprovados: ");
        for ( int i = 0; i < N; i++){
            if ( alunos[i].getMedia() > 6.0){
                System.out.println(alunos[i].getNome());
            }
        }

    }
}
