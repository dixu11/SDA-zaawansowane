package oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3Demo {
    public static void main(String[] args) {
        File file = new File("plik.txt");
        try {
            Scanner scanner = new Scanner(file); //checked exception -> muszą zostać obsłużone!
            System.out.println("Czytam z pliku..");
            String tekst = "";
            while (scanner.hasNextLine()){
                tekst += scanner.nextLine() + "\n";
            }
            System.out.println(tekst);
        }catch (FileNotFoundException e){
            System.out.println("Plik nie został znaleziony!");
        }
        System.out.println("Koniec");

    }
}
