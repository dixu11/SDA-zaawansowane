package collections.restaurant;

import java.util.*;

/*
* ontynuuj pracę nad restauracją implementując następujące metody:
metoda zwracająca wszystkie dania w formie nieuporządkowanej
metoda zwracająca dania posortowane wg. Comparatora porównującego ceny
metoda zwracająca dania posortowane wg. Comparatora porównującego wartości kaloryczne
zmodyfikuj poprzednią metodę tak żeby przyjmowała argument typu enum o wartości DESC lub ASC modyfikujący działanie metody. W przypadku ASC sortować ma rosnąco w przypadku DESC malejąco
metoda zwracająca dania wg ich naturalnego porządku - w pierwszej kolejności wg. nazwy, w drugiej według ceny
*
* */
public class RestaurantService {

    private Set<Dish> dishes = new HashSet<>();

    public RestaurantService(){
    }


    public void addDish(Dish dish){
        dishes.add(dish);
    }

    public List<Dish> getDishesSortedByPrise(){
        List<Dish> sorted = new ArrayList<>(dishes);
        sorted.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish dish1, Dish dish2) {
                return (int)(dish1.getPrice() - dish2.getPrice());
            }
        });
        return sorted;
    }


    public Dish findDishesByExactName(String name){
        for (Dish dish : dishes) {
            if (dish.getName().equals(name)) {
                return dish;
            }
        }
        throw new RestaurantServiceException("Nie znaleziono potrawy!");
    }

    public List<Dish> findDishesByNameFragment(String nameFragment){
        List<Dish> dishesFound = new ArrayList<>();
        for (Dish dish : dishes) {
            if (dish.getName().contains(nameFragment)) {
                dishesFound.add(dish);
            }
        }
        return dishesFound;
    }

    public Set<Dish> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {
        return "RestaurantService{" +
                "dishes=" + dishes +
                '}';
    }
}
