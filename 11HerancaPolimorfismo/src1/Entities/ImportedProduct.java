package Entities;

import java.text.SimpleDateFormat;

public class ImportedProduct extends Product{

    // Atributos
    private Double customFee;

    // Constructors
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String nome, Double price, Double customFee) {
        super(nome, price);
        this.customFee = customFee;
    }

    // Getters and Setters
    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    // Methods
    @Override
    public String priceTag(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format(getNome() + " $ " + getPrice() + ( " Custom fees: $ " ) + getCustomFee() );
    }

    public double totalPrice(){
        return super.getPrice() + getCustomFee();
    }


}
