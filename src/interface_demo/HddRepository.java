package interface_demo;

public class HddRepository implements Repository {

    public void loadData() {
        System.out.println("Wczytuję dane z dysku");
    }

    public void saveData() {
        System.out.println("Zapisuję dane aplikacji na dysku");
    }

}
