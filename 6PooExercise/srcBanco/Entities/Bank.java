package Entities;

public class Bank {

    // Atributes
    private int accountNumber;
    private String clientName;
    private double amount;

    // Constructors

    public Bank(int accountNumber, String clientName, double amount){
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        this.amount = amount;
    }

    public Bank(int accountNumber, String clientName){
        this.accountNumber = accountNumber;
        this.clientName = clientName;
    }

    // Getters

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getClientName(){
        return clientName;
    }

    public void setClientName(String name){

        this.clientName = name;
    }

    public double getAmount(){
        return amount;
    }

    // Methods

    public String deposity(double value){
        amount += value;

        return toString();

    }

    public String withdraw(double value){

        amount -= value + 5;
        return toString();
    }

    public String toString(){
        return String.format("Account %d, Holder: %s, Balance: $ %.2f",getAccountNumber(),getClientName(),getAmount());
    }


}
