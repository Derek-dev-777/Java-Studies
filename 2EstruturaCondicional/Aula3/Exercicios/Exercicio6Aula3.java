
import java.util.Scanner;

// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
public class Exercicio6Aula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor;

        valor = sc.nextInt();

        if (valor >= 0 && valor <= 25) {
            System.out.println("O valor esta entre 0 e 25");
        } else if (valor >= 26 && valor <= 50) {
            System.out.println("O valor esta entre 26 e 50");
        } else if (valor >= 51 && valor <= 75) {
            System.out.println("O valor esta entre 51 e 75");
        } else if (valor >= 76 && valor <= 100) {
            System.out.println("O valor esta entre 76 e 100");
        } else {
            System.out.println("Valor fora dos intervalos");
        }

    }
}
