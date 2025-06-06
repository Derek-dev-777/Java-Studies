
import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.
public class Exercicio1Aula2 {

    public static void main(String[] args) {

        // Declarando variaveis e criando um scanner
        int a, b, resultado;
        Scanner sc = new Scanner(System.in);

        // Lendo dados enviados pelo usuario
        a = sc.nextInt();
        b = sc.nextInt();

        // Fazendo a soma do resultado
        resultado = a + b;

        // Exibição do resultado
        System.out.println("Resultado: " + resultado);

    }
}
