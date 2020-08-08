package advanced.io.example;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        File file = new File("C:/Materiały/java/Java8/DO SKASOWANIA.txt");
        File file2 = new File("src");
        File file3 = new File("src/Klasa.java");
        File file4 = new File("test.txt");
       // file.delete();


        System.out.println(file.exists());
        System.out.println(file2.exists());

        for (String name : file2.list()) {
            System.out.println(name);
        }


       /* try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Hello");
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/


        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file,true));
            printWriter.println("Hej");
            printWriter.println("Witam w pliku");
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
