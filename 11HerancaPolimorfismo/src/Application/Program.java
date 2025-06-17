package Application;

import Entities.Employee;
import Entities.OutsiderEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Digite o numero de empregados");
        int n = sc.nextInt();

        for( int i = 1; i <= n; i++){
            System.out.println("Digite os dados do funcionario");
            System.out.println("Tercerizado? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            int hours = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.println("Despesa adicional: ");
                double additionalCharge = sc.nextDouble();

                // Criando o funcionario utilizando polimorfismo( classe employee, mas foi criado na outra)
                Employee emp = new OutsiderEmployee(nome,hours,valuePerHour,additionalCharge);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(nome, hours, valuePerHour);
                list.add(emp);
            }

            System.out.println();
            System.out.println("PAYMENTS:");


            }

        for ( Employee emp : list){
            System.out.println(emp.getName() + " - $" + String.format("%.2f",emp.payment()) );

        }
    }
}
