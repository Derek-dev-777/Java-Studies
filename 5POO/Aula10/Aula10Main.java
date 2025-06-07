package Aula10;

import java.util.Scanner;

public class Aula10Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite as medidas do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("A area do triangulo X é: %.4f", areaX);
        System.out.printf("A area do triangulo Y é: %.4f", areaY);

        if (areaX > areaY) {
            System.out.println("A maior area é do triangulo X");
        } else if (areaX < areaY) {
            System.out.println("A maior area é do triangulo Y");
        } else {
            System.out.println("Ambos tem areas iguais");
        }

    }
}
