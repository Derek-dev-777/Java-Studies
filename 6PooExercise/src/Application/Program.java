package Application;

import Entities.Retangle;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        // Declaração das variaveis e do objeto retangulo
        Scanner sc = new Scanner(System.in);
        Retangle retangulo = new Retangle();

        // Coletando as informações de altura e largura
        System.out.println("Enter rectangle width and height: ");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println(retangulo);






    }
}
