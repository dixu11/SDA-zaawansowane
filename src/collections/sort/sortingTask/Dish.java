package collections.sort.sortingTask;

import java.util.Objects;

//jak zbudowane jest danie
//Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum - typ (np. BREAKFAST, DINNER, APPETIZER).
public class Dish {
    private String name;
    private double price;
    private double kcal;
    private KindOfDish kind;

    public Dish(String name, double price, double kcal, KindOfDish kind) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 &&
                Double.compare(dish.kcal, kcal) == 0 &&
                Objects.equals(name, dish.name) &&
                kind == dish.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, kcal, kind);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", kcal=" + kcal +
                ", kind=" + kind +
                '}';
    }
}
