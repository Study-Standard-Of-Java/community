package chapter12.direction.directionaddmember;

public enum Direction {
    EAST(1), SOUTH(5), WEST(-1), NORTH(10);

    private final int value;

    public int getValue() {
        return value;
    }

    Direction(int value) {
        this.value = value;
    }
}
