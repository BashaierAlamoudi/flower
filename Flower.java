package classes;

public class Flower {

    private String FlowerType;
    private int quantity;
    private double price;

    public Flower(String FlowerType, int quantity, double price) {
        this.FlowerType = FlowerType;
        this.quantity = quantity;
        this.price = price;
    }

    public void setFlowerType(String FlowerType) {
        this.FlowerType = FlowerType;
    }

    public void setNumOfFlower(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFlowerType() {
        return FlowerType;
    }

    public int getNumOfFlower() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
