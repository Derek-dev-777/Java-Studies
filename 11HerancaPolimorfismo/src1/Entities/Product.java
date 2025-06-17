package Entities;

public class Product {

    // Atributos
    private String nome;
    private Double price;

    // Constructors
    public Product(){}

    public Product(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    // Getters and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Methods
    public String priceTag(){
        return String.format(getNome() + " $ " + getPrice());
    }
}
