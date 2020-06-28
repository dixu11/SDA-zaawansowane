package enumerated_types;

import javax.swing.*;

public class SignDemo {
    public static void main(String[] args) {

        Sign sign = new Sign(Direction.WEST);
        Sign sign2 = new Sign(Direction.NORTH);

        System.out.println(sign.isFacingNorth());
        System.out.println(sign2.isFacingNorth());

        for (Direction value : Direction.values()) {
            System.out.println(value);
        }

        Direction singsDirection = sign.getDirection();
        System.out.println(singsDirection.getPolishName());



        switch (singsDirection){
            case NORTH:
                System.out.println("Idziemy na północ");
                break;
            case EAST:
                break;
            case SOUTH:
                break;
            case WEST:
                System.out.println("Idziemy na zachód");
                break;
        }

        System.out.println(sign.getDegrees());

        Direction myDirection = new Direction();


    }
}
