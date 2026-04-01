import java.util.Random;

public enum Direction {
    VERTICAL (0),
    HORIZONTAL (1);

    private final int dir;

    Direction(int dir) {
        this.dir = dir;
    }

    public Direction getRandomDir() {
        int rand = new Random().nextInt(2);
        return rand;
    }
}
