package Entities4;

public class CurrencyConverter {

    public  double dollarPrice;
    public  double howMuchDollarsBought;
    public  double real;


    public  double dollarToReal(){

        return howMuchDollarsBought * dollarPrice * (1.0 + 0.06);

    }

    public String toString(){
        real = dollarToReal();
        return String.format("Amount to be paid in real: %.2f", real);
    }
}
