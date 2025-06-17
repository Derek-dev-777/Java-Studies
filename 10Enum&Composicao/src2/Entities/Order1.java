package Entities;

import EnumEntities.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order1 {

    // Atributos
    private Date moment;
    private OrderStatus status;

    // Composição
    private Client client;
    private List<OrderItem> orderItemList= new ArrayList<>();

    // Construtores
    public Order1(){}

    public Order1(Date moment, Client client, OrderStatus status) {
        this.moment = moment;
        this.client = client;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem orderItem){
        orderItemList.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }

    public double total(){
        double total = 0.0;
        for (OrderItem item : orderItemList){
            total += item.subTotal();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfClient = new SimpleDateFormat("dd/MM/yyyy");

        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName())
                .append(" (").append(sdfClient.format(client.getBirthDate())).append(")")
                .append(" - ").append(client.getEmail()).append("\n");

        sb.append("Order items:\n");
        for (OrderItem item : orderItemList) {
            sb.append(item.getProduct().getName()).append(", $")
                    .append(String.format("%.2f", item.getPrice()))
                    .append(", Quantity: ").append(item.getQuantity())
                    .append(", Subtotal: $").append(String.format("%.2f", item.subTotal()))
                    .append("\n");
        }

        sb.append("Total price: $").append(String.format("%.2f", total()));

        return sb.toString();
    }
}
