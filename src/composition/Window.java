package composition;

public class Window {

    private boolean open;

    public void open(){
        open = true;
    }

    @Override
    public String toString() {
        return "Window{" +
                "open=" + open +
                '}';
    }
}
