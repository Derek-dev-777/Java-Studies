package Application4;

import Entities4.CurrencyConverter;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Enter the dollar price: ");
        converter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought: ");
        converter.howMuchDollarsBought = sc.nextDouble();

        System.out.println(converter);

    }
}
