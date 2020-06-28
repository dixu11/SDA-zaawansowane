package composition;

import java.util.Arrays;

public class Room {

    private Bed bed;
    private Window[] windows;

    public Room(int windowsCount){
        bed = new Bed();
        Window[] windows = new Window[windowsCount];
        for(int i = 0; i<windowsCount; i++){
            Window window = new Window();
            windows[i] = window;
        }
        this.windows = windows;
    }

    public void openAllWindows() {
        for (Window window : windows) {
            window.open();
        }
    }

    public void makeBed() {
        bed.make();
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", windows=" + Arrays.toString(windows) +
                '}';
    }
}
