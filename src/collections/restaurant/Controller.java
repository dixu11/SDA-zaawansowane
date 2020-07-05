package collections.restaurant;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

// użytkownik komunikuje się z aplikacją ona zleca co trzeba i prezentuje mu wynik
public class Controller {

   private RestaurantService restaurantService;
    private boolean running = true;
  private   Scanner scanner = new Scanner(System.in);

    public Controller(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    public void start(){
       while (running){
           handleOneOption();
       }
   }

   private void handleOneOption(){
        try {
            executeOneOption();
        }catch (RestaurantServiceException e){
            System.out.println(e.getMessage());
        }
   }

   private void executeOneOption(){
       System.out.println("Witamy w restauracji, co chcesz zrobić?");
       System.out.println("1. Wyświetl potrawy");
       System.out.println("2. Znajdź potrawę po nazwie");
       System.out.println("3. Znajdź potrawę po fragmencie nazwy");
       System.out.println("4. Zamknij aplikacje");

       int input = scanner.nextInt(); // pobrało ze skanera liczbę i zostawiło w środku /n
       scanner.nextLine(); // konsumuje /n w skanerze
       switch (input){
           case 1:
               printDishes(restaurantService.getDishes());
               break;
           case 2:
                findDishByName();
                break;
           case 3:
            findDishesByNameFragment();
            break;
           case 4:
               close();
               break;
       }
   }

   private void printDishes(Collection<Dish> dishes){
       for (Dish dish : dishes) {
           System.out.println(dish);
       }
   }

   private void findDishByName(){
       System.out.println("Wpisz nazwę potrawy której szukasz");
       String dishName = scanner.nextLine(); //ściąga tamten enter i dopiero następnym razem zadziała
       System.out.println("Szukam potrawy o nazwie: " + dishName);
       Dish dishFound = restaurantService.findDishesByExactName(dishName);
       System.out.println("Znaleziono danie: " + dishFound);
   }

   private void findDishesByNameFragment(){
       System.out.println("Wpisz fragment nazwy potrawy której szukasz");
       String dishName = scanner.nextLine(); //ściąga tamten enter i dopiero następnym razem zadziała
       System.out.println("Szukam potrawy o nazwie: " + dishName);
       List<Dish> dishesFound = restaurantService.findDishesByNameFragment(dishName);
       if (dishesFound.isEmpty()) {
           System.out.println("Nie znaleziono");
           return;
       }

       System.out.println("Znaleziono dania: ");
       printDishes(dishesFound);
   }

   private void close(){
       System.out.println("Zamykamy interes");
       running = false;
   }




}
