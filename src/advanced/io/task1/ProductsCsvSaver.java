package advanced.io.task1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductsCsvSaver {

    private String fileName;

    public ProductsCsvSaver(String fileName) {
        this.fileName = fileName;
    }

    public void saveProducts(List<Product> products) {
        List<String> lines = convertProductsToLines(products);
        saveLinesToFile(lines);
    }

    private void saveLinesToFile(List<String> lines){
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for (String line : lines) {
                printWriter.println(line);
            }
            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot create file");
        }
    }


    private List<String> convertProductsToLines(List<Product> products){
        List<String> lines = new ArrayList<>();
        for (Product product : products) {
            lines.add(convertProductToLine(product));
        }
        return lines;
    }

    private String convertProductToLine(Product product) {
       return product.getName() + "," + product.getPrice() + "," + product.getAmount();
    }







}
