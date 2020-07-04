package oop.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        String tekst = null;
        System.out.println("Start");
        try{
            System.out.println(tekst.toUpperCase());
            System.out.println("Dalszy ciąg w try");
        }catch (NullPointerException exception){
            System.out.println("Był null pointer, no trudno");
        }finally { //wykonuje się bez względu na to czy wystąpi wyjątek czy nie
            System.out.println("Zapis danych");
        }

        System.out.println("Koniec");
    }
}
