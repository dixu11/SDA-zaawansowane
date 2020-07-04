package exceptions.zadanie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDbConnection {

    private boolean connected;

    public void connect() throws FileDbConnectionException{
        if (Math.random() <= 0.25) {
            throw new FileDbConnectionException("Nie uzyskano połączenia z bazą");
        }
        connected = true;
    }

    public String readFileData() throws FileDbConnectionException {
        File file = new File("plikdfgdf.txt");
        try {
            Scanner scanner = new Scanner(file); //checked exception -> muszą zostać obsłużone!
            System.out.println("Czytam z pliku..");
            String tekst = "";
            while (scanner.hasNextLine()){
                tekst += scanner.nextLine() + "\n";
            }
            scanner.close();
            return tekst;
        }catch (FileNotFoundException e){
            throw new FileDbConnectionException("Plik nie został znaleziony!");
        }
    }

    public boolean isConnected() {
        return connected;
    }

    public void disconnect() {
        connected = false;
    }
}
