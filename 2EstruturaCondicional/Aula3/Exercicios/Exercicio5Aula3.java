
import java.util.Scanner;

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar
public class Exercicio5Aula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double valor, total;

        valor = 0;

        System.out.println("Digite o codigo do do item:");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade de itens:");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            valor = 4.00;
        } else if (codigo == 2) {
            valor = 4.50;
        } else if (codigo == 3) {
            valor = 5.00;
        } else if (codigo == 4) {
            valor = 2.00;
        } else if (codigo == 5) {
            valor = 1.50;
        } else {
            System.out.println("Digite um codigo valido.");
        }

        total = (double) quantidade * valor;

        System.out.printf("Total R$ %.2f", total);

        sc.close();
    }
}
