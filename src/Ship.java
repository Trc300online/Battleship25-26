import java.util.ArrayList;

public class Ship {

    public int[] headPosition = new int[2];
    public Direction direction;
    public ShipType type;
    public ArrayList<ShipPart> shipParts = new ArrayList<>();
    private boolean isSunk = false;
    public static final int[] shipsLenght = {5, 4, 3, 3, 2};
}
