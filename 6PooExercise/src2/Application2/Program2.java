package Application2;

import Entities2.Employee;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.name = sc.nextLine();
        System.out.println("Digite o salario do funcionario: ");
        funcionario.salary = sc.nextDouble();
        System.out.println("Digite a taxa do salario do funcionario: ");
        funcionario.tax = sc.nextDouble();
        funcionario.netSalary();

        System.out.println(funcionario);

        System.out.println("Qual a porcentagem que você deseja dar de aumento: ");
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println(funcionario);

    }
}
