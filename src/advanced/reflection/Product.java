package advanced.reflection;

import java.io.Serializable;
import java.time.LocalDate;

public final class Product implements Serializable {

    private String name;
    private double price;
    private int amount;


    private static final long serialVersionUID = 7583364665077602920L;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void increasePrice(double amount) {
        price += amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
