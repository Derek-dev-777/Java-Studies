package Entities;

public class OrderItem {

    // Atributos
    private Integer quantity;
    private Double price;

    private Product product;

    // Construtores
    public OrderItem(){}

    public OrderItem(Integer quantity, Product product, Double price) {
        this.quantity = quantity;
        this.product = product;
        this.price = price;
    }

    // Getters e setters
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public double subTotal(){
        return quantity * price;

    }
}
