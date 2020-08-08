package advanced.io.serialization;

import java.io.*;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
      /*  Product p1 = new Product("Maszyna do ćwierkania", 100,2);
        Product p2 = new Product("Pralka", 2000, 5);
        List<Product> products = List.of(p1, p2);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.bin"));
           oos.writeObject(products);
           oos.flush();
           oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.bin"));
           List<Product> products = (List<Product>)  ois.readObject();
           ois.close();
            System.out.println(products);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        //obiekty w kompozycji też trzeba oznaczyć jako serializable
        //gdyby w kompozycji był obiekt którego nie możemy oznaczyć jako serializable -> transcient -> pominięte przy serializacji



    }

}
