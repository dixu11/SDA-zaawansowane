package oop.exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exceptions2Demo {

    private static List<String> wrongInputs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int[] tab = {1, 2, 3, 4};
        try{
            int result = scanner.nextInt();
            System.out.println("Wynik to: " + result);
            System.out.println("Twoja liczba z tablicy: " + tab[result]);
            System.out.println("dzielimy przez 0:" + (result / 0));
        }catch (InputMismatchException e){
            System.out.println("Trzeba było podać liczbę!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Wyszliśmy poza zakres tablicy");
        }catch (Exception e){
            System.out.println("Inny nieprzewidziany wyjątek");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        /*System.out.println("Pobieramy liczbę");
        int number = getNumber("Podaj wiek");
        System.out.println("Odnotowano wiek: " + number);
*/

    }


    public static int getNumber(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        try {
            int result = scanner.nextInt();
            return result;
        }catch (InputMismatchException e){
            String coPodano = scanner.nextLine();
            System.out.println("Podano nieprawidłowe dane: " + coPodano);
            wrongInputs.add(coPodano);
           return getNumber(message);
        }
    }
}
