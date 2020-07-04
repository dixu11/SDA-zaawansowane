package oop.enumerated_types;

public class Sign {

    private Direction direction;

    public Sign(Direction direction) {
        this.direction = direction;
    }

    public boolean isFacingNorth() {
        return direction == Direction.NORTH;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getDegrees() {
        return direction.getDegrees();
    }

    @Override
    public String toString() {
        return "Sign{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
