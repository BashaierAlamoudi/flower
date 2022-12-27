package classes;

import java.util.ArrayList;

// Subclass of superclass(Order)
public class Cart extends Order {

    double total;
    double tax;
    ArrayList<Order> order = new ArrayList<>();

    public Cart(double total) {
        this.total = total;
    }

    public Cart(ArrayList<Order> order) {
        this.order = order;
    }

    // This method is responsible to calculate the total of the order 
    public double calculateTotal() {
        // Loop to get the price and quantity of each type 
        for (int i = 0; i < order.size(); i++) {
            double t = order.get(i).QTY * order.get(i).price;
            total += t;
        }
        return total;
    }

    // This method is responsible to calculate the total with Tax 
    public double calculateTax() {
        return (total * 0.15) + total;
    }

    @Override
    // This method is responsible to generate the order details
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\n\t" + "~~ Tayp ~~" + "\t      " + "~~Quantity ~~" + "\t\t" + "~~ Price ~~\n\n");
        if (order != null) {
            for (int i = 0; i < order.size(); i++) {
                // print the order (type , quantity and price)
                str.append("\t").append(order.get(i).type).append("\t\t").append(order.get(i).QTY).append("\t\t").append(order.get(i).price * order.get(i).QTY).append("  SR\n\n");

            }
        }

        return str.toString();
    }

}
