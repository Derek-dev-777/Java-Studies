package Application;

import Entities.Product;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product name:");
        product.name = sc.nextLine();

        System.out.println("Price: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: "+ product);
        System.out.println();
        System.out.println("Enter the amount of product quantity you want to add: ");
        int quantity = sc.nextInt();

        product.addQuantity(quantity);
        System.out.println("Product data: "+ product);

        System.out.println();
        System.out.println("Enter the amount of product quantity you want to remove: ");
        quantity = sc.nextInt();
        product.removeQuantity(quantity);

        System.out.println("Product data: "+ product);






    }
}
