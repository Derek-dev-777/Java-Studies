package Application;

import Entities.Triangle;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Digite as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A area do triangulo X é: %.4f%n", areaX);
        System.out.printf("A area do triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior area é do triangulo X");
        } else if (areaX < areaY) {
            System.out.println("A maior area é do triangulo Y");
        } else {
            System.out.println("Ambos tem areas iguais");
        }

    }
}
