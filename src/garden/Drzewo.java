package garden;

public class Drzewo {

    private boolean podlane = false;

    public void podlej() {
        System.out.println("Podlewa drzewo!");
        podlane = true;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "podlane=" + podlane +
                '}';
    }
}
