package Application;

import Entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios serão registrados?");
        int N = sc.nextInt();

        // Cria uma lista com base na classe funcionario
        List<Funcionario> funcionarios = new ArrayList<>();

        // Coleta os dados dos funcionarios
        for (int i = 0; i < N; i++){
            System.out.println("Digite id do funcionario: ");
            int id = sc.nextInt();
            System.out.println("Digite o nome do funcionario: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Digite o salario do funcionario:");
            double salary = sc.nextDouble();

            // apos coletarmos os dados dos funcionarios, criamos uma classe a partir deles
            // igual uma classe qualquer
            Funcionario funcionario = new Funcionario(id,salary,name);

            // e então adicionamos esse funcionario dentro da lista ( funcionarios )
            funcionarios.add(funcionario);
            System.out.println(funcionarios.get(i));
        }

        System.out.println("Digite o id do funcionario que recebera um aumento:");
        int id = sc.nextInt();
        System.out.println("Digite a porcentagem do aumento:");
        double percentage = sc.nextDouble();

        // for each, essa lista percorre a nossa list, X é como se fosse um funcionario
        // então podemos usar os atributos da classe utilizando x.
        // x.getId, x.increaseSalary etc.
        for (Funcionario x : funcionarios){
            if (x.getId() == id){
                x.increaseSalaryPercentage(percentage);
            }
        }

        System.out.println("Lista dos empregados");

        for ( Funcionario x : funcionarios){
            System.out.println(x);
        }

    }
}
