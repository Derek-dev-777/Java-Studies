package Entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addQuantity(int quantity){

        this.quantity += quantity;

    }

    public void removeQuantity(int quantity){

        this.quantity -= quantity;
    }

    public String toString(){

        return name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalValueInStock();
    }
}
