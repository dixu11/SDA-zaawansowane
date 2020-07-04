package interface_demo;

public class DbRepository implements Repository {

    public void loadData() {
        System.out.println("Wczytuję dane z bazy");
    }

    public void saveData() {
        System.out.println("Zapisuję dane aplikacji w bazie danych");
    }
}
