package Application3;

import Entities3.Student;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();

        System.out.println("Digite as 3 notas deste aluno: ");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        double notaFinal = student.calcularNotaFinal();
        System.out.println(student);

        String passou = student.PassouOuNao();
        System.out.println(passou);



    }
}
