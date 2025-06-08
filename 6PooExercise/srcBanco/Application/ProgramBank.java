package Application;

import Entities.Bank;
import java.util.Scanner;

public class ProgramBank {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there a initial deposit? (s/n)");
        char yesOrNo = sc.next().charAt(0);
        Bank bankAccount;
        double deposit;

        if ( yesOrNo != 'n'){
            System.out.println("Enter the initial deposit value: ");
            deposit = sc.nextDouble();
            bankAccount = new Bank(accNumber, name, deposit);

            System.out.println("Account data:");
            System.out.println(bankAccount);

        }
        else {
            bankAccount = new Bank(accNumber, name);
            System.out.println("Account data:");
            System.out.println(bankAccount);
        }

        System.out.println("Enter a deposit value: ");
        deposit = sc.nextDouble();
        bankAccount.deposity(deposit);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        System.out.println("Enter withdraw value: ");
        double withdraw = sc.nextDouble();
        bankAccount.withdraw(withdraw);
        System.out.println("Updated account data:");
        System.out.println(bankAccount);







    }

}
