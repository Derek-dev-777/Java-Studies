package Application;

import Entities.Account;
import Exceptions.DomainException;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double limit = sc.nextDouble();

            Account account = new Account(number, holder, balance, limit);

            System.out.println();
            System.out.print("Enter the amount to withdraw: ");
            Double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.println("New Balance: " + account.getBalance());
            sc.close();
        }
        catch (DomainException e){
            System.out.println("Error: " + e.getMessage());
        }



    }
}
