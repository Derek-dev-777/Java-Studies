
import java.util.Scanner;

public class Aula2CastingeScanner {

    public static void main(String[] args) {

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        // abaixo nós converteremos o resultado que seria int para double, evitando erro no calculo
        resultado = (double) a / b; // Casting nada mais é do que informar/ converter o resultado de uma operação

        System.out.println(resultado);

        // Criando um scanner
        Scanner sc = new Scanner(System.in);

        // Atribuindo a uma variavel e lendo uma string
        String x;
        x = sc.next();

        System.out.println("A palavra digitada foi " + x);

        // Atribuindo a uma variavel e lendo um int
        int y;
        y = sc.nextInt();

        System.out.println(" o numero digitada foi " + y);

        // Atribuindo a uma variavel e lendo um double
        double z;
        z = sc.nextDouble();

        System.out.println("O numero digitada foi " + z);

        // Atribuindo a uma variavel e lendo um char
        char p;

        p = sc.next().charAt(0);

        System.out.println("O char foi " + p);

        // Como ler uma frase toda 
        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Fechando/Encerrando o scanner
        sc.close();

    }
}
