
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
public class Exercicio4Aula2 {

    public static void main(String[] args) {

        // Declaração de variaveis
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        // Criação de scanners
        Scanner sc = new Scanner(System.in);

        // Coleta de informações com scanner
        System.out.println("Digite seu numero de funcionario");
        numeroFuncionario = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor que você recebe por horas");
        valorHora = sc.nextDouble();

        // Calculo de salario
        salario = (double) horasTrabalhadas * valorHora;

        // exibição de informações
        System.out.printf("O salario do funcionario n° %d é de: %.2f", numeroFuncionario, salario);

    }
}
