package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    // Atributos
    private Date manufacture;

    //Construtores
    public UsedProduct(){
        super();
    }

    public UsedProduct(String nome, Double price, Date manufacture) {
        super(nome, price);
        this.manufacture = manufacture;
    }

    // Getters and setter
    public Date getManufacture() {
        return manufacture;
    }

    public void setManufacture(Date manufacture) {
        this.manufacture = manufacture;
    }

    // Methods
    @Override
    public String priceTag(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format(getNome() + " (used) $ " + getPrice() + " (Manufacture date: " + sdf.format(manufacture) + ")");
    }


}
