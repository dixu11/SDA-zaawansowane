package composition;

import java.util.Arrays;

public class House {

    private Door door = new Door();
    private Room[] rooms;

    public House(Room[] rooms){
        this.rooms = rooms;
    }

    public void cleanUp(){
        for (Room room : rooms) {
            room.makeBed();
            room.openAllWindows();
        }
    }


    @Override
    public String toString() {
        return "House{" +
                "door=" + door +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
