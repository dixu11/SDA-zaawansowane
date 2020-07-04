package oop.exceptions.zadanie;

public class FileDbConnectionException extends Exception { //checked / compile time exception -> wymaga obsługi

    public FileDbConnectionException(String message) {
        super(message);
    }
}
