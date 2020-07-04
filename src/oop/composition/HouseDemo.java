package oop.composition;

public class HouseDemo {

    public static void main(String[] args) {
       /* Room room1 = new Room(2);
        Room room2 = new Room(4);*/
        //sposob1
       /* Room[] rooms = new Room[2];
        rooms[0] = room1;
        rooms[1] = room2;*/

        //sposob2
        //Room[] rooms = {room1,room2};

        //sposób3
        Room[] rooms = {new Room(2), new Room(4)};

        House house = new House(rooms);
        System.out.println(house);

        house.cleanUp();
        System.out.println(house);

    }


}
