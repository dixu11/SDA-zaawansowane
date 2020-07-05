package collections.restaurant;

/*
* PRzechowywać zestaw potraw
* POzwala zamówić potrawe
* drukować cennik
* */

//zbudowanie i uruchomienie aplikacji
public class RestarantLauncher {
    public static void main(String[] args) {

        RestaurantService restaurantService = new RestaurantService();
        restaurantService.addDish(new Dish("pizza", 25,800,KindOfDish.DINNER));
        restaurantService.addDish(new Dish("hot-dog", 6,300,KindOfDish.APPETIZER));
        restaurantService.addDish(new Dish("mięsny jeż", 30,400,KindOfDish.APPETIZER));
        restaurantService.addDish(new Dish("ryż z kurczakiem", 30,500,KindOfDish.BREAKFAST));
        Controller controller = new Controller(restaurantService);

        controller.start();

    }
}
