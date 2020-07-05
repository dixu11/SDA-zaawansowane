package collections.sort.sortingTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//przygotowuje odpowiednie dane (wyszukowanie, sortowanie, filtracja), zmienia stan obiektu (np. dodaje nowe zamówienie) -> cała logika aplikacji
public class RestaurantService {

    private Set<Dish> dishes = new HashSet<>();

    public RestaurantService(){
    }


    public void addDish(Dish dish){
        dishes.add(dish);
    }

    /*
    * stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać obiekt typu Dish, w przypadku nie odnalezienia
    *  takiego obiektu obiektu ma rzucać wyjątek typu RestaurantException
    * */

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
