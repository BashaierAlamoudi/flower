package classes;

import java.util.ArrayList;

public class Order {

    int QTY;
    String type;
    double totalPrice;
    double price;
    ArrayList<Order> userOrder = new ArrayList<>();

    public Order(int QTY, String type, double price) {
        this.QTY = QTY;
        this.type = type;
        this.price = price;
    }

    public Order() {
    }

    public Order order(Order newOrder) {
        userOrder.add(newOrder);
        return newOrder;
    }

    public int getQTY() {
        return QTY;
    }

    public void setQTY(int QTY) {
        this.QTY = QTY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
