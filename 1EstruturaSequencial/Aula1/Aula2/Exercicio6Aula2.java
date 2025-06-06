
import java.util.Scanner;

// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
// mostre:
// a) a área do triângulo retângulo que tem A por base e C por altura.
// b) a área do círculo de raio C. (pi = 3.14159)
// c) a área do trapézio que tem A e B por bases e C por altura.
// d) a área do quadrado que tem lado B.
// e) a área do retângulo que tem lados A e B.
public class Exercicio6Aula2 {

    public static void main(String[] args) {

        double A, B, C, areaTriangulo, pi, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        // Coleta de dados 
        System.out.println("Digite 3 numeros e iremos mostrar informações com esses numeros:");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // Calculo da area do triangulo ( A ), e exibição do resultado
        areaTriangulo = (A * C) / 2;
        System.out.printf("A area de um triangulo retangulo de base %.2f e altura %.2f é: %.2f%n", A, C, areaTriangulo);

        // Calculo da area de um circulo ( B ), e exibindo seu resultado
        areaCirculo = pi * Math.pow(C, 2);
        System.out.printf("A area de um circulo de raio %.2f é: %f%n", C, areaCirculo);

        // Calculo da area de um trapezio ( C ), e exibição de seu resultado
        areaTrapezio = ((A + B) * C) / 2;
        System.out.printf("Area de um trapezio de bases %.2f e %.2f, altura %.2f é: %.2f%n", A, B, C, areaTrapezio);

        // Calculo da area de um quadrado ( D ), exibição do resultado
        areaQuadrado = B * B;
        System.out.printf("A area de um quadrado de lados %.2f é: %.2f%n", B, areaQuadrado);

        // Calculo da area de um retangulo ( E ), exibição do resultado
        areaRetangulo = A * B;
        System.out.printf("A area de um retangulo de lados %.2f e %.2f é: %.2f%n", A, B, areaRetangulo);

    }
}
