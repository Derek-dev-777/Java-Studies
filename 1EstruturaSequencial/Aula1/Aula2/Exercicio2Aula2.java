
import java.util.Scanner;

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159
public class Exercicio2Aula2 {

    public static void main(String[] args) {

        double raio, area, pi;
        System.out.println(" Digite o valor do raio de um circulo:");

        // Criando scanner
        Scanner sc = new Scanner(System.in);

        // Atribuindo valores nas variaveis
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * Math.pow(raio, 2); // Fazendo o calculo matematico ( raio elevado a 2)

        // Mostrando os valores na tela
        System.out.printf("A area de um circulo com raio %.2f é: %.4f", raio, area);

    }
}
