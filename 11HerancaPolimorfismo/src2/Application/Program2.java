package Application;

import Entities.Pessoa;
import Entities.PessoaFisica;
import Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Digite o numero de pagantes de imposto: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.printf("DADOS DA #%d PESSOA%n", i);
            System.out.print("Pessoa fisica ou juridica? (f/j): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if(ch == 'f'){
                System.out.print("Gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                Pessoa pessoa = new PessoaFisica(nome,rendaAnual,gastosSaude);
                list.add(pessoa);
            }
            else {
                System.out.print("Numero de funcionarios: ");
                int numeroFuncionarios = sc.nextInt();
                Pessoa pessoa = new PessoaJuridica(nome,rendaAnual,numeroFuncionarios);
                list.add(pessoa);

            }

        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");

        double sum = 0.0;
        for ( Pessoa pessoa : list){
            sum += pessoa.calcularImposto();
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f",pessoa.calcularImposto()));
        }

        System.out.printf("IMPOSTO TOTAL: $ %.2f%n", sum);



    }
}
