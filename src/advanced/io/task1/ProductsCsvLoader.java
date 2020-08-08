package advanced.io.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsCsvLoader {

    private String fileName;

    public ProductsCsvLoader(String fileName) {
        this.fileName = fileName;
    }

    public List<Product> loadProducts() {
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        List<Product> products = new ArrayList<>();
        for (String line : lines) {
           String[] data = line.split(",");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int amount = Integer.parseInt(data[2]);
            Product product = new Product(name, price, amount);
            products.add(product);
        }

        return products;
    }
}
