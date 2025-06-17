package Application;

import Entities.Client;
import Entities.Order1;
import Entities.OrderItem;
import Entities.Product;
import EnumEntities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        // Creating the class Client
        System.out.println("Enter client data:");
        System.out.println("Name: ");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY):");
        String birthDateSTR = sc.nextLine();
        Client client = new Client(nome,email,sdf.parse(birthDateSTR));


        System.out.println("Status: ");
        String status = sc.nextLine();
        Order1 order1 = new Order1(new Date(), client, OrderStatus.valueOf(status));

        System.out.println("How many items to this order?");
        int numberItems = sc.nextInt();
        for (int i = 0 ; i < numberItems; i++){
            System.out.printf("Enter the #%d item data: %n", i);
            System.out.println("Product Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product Price: ");
            Double price = sc.nextDouble();
            Product product = new Product(productName, price);

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(quantity,product,price);
            order1.addItem(orderItem);

        }

        System.out.println("ORDER SUMMARY: ");
        System.out.println(order1);


    }
}
