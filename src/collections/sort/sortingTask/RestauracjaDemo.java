package collections.sort.sortingTask;

import collections.restaurant.Dish;
import collections.restaurant.KindOfDish;
import collections.restaurant.RestaurantService;

import java.util.List;

public class RestauracjaDemo {



    public static void main(String[] args) {
       RestaurantService restaurantService = new RestaurantService();
        restaurantService.addDish(new collections.restaurant.Dish("pizza", 25,800, collections.restaurant.KindOfDish.DINNER));
        restaurantService.addDish(new collections.restaurant.Dish("hot-dog", 6,300, collections.restaurant.KindOfDish.APPETIZER));
        restaurantService.addDish(new collections.restaurant.Dish("mięsny jeż", 30,400, collections.restaurant.KindOfDish.APPETIZER));
        restaurantService.addDish(new Dish("ryż z kurczakiem", 30,500, KindOfDish.BREAKFAST));

        List<Dish> dishes = restaurantService.getDishesSortedByPrise();
        for (Dish dish : dishes) {
            System.out.println(dish);
        }


    }
}
