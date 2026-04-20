import java.util.ArrayList;

public class Ship {

    private int[] headPosition = new int[2];
    private Direction direction;
    private ShipType type;
    private ArrayList<ShipPart> shipParts = new ArrayList<>();

    public Ship(int[] hPos, Direction dir, ShipType type) {
        this.headPosition = hPos;
        this.direction = dir;
        this.type = type;
        if (dir == Direction.VERTICAL) {
            for (int i = 0; i < type.getSize(); i++) {
                shipParts.add(new ShipPart(hPos[0]+i, hPos[1], this));
            }
        } else {
            for (int i = 0; i < type.getSize(); i++) {
                shipParts.add(new ShipPart(hPos[0], hPos[1]+i, this));
            }
        }
    }

    public int[] getHeadPosition() {
        return headPosition;
    }

    public void setHeadPosition(int[] hPos) {
        this.headPosition = hPos;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public ShipType getType() {
        return type;
    }

    public void setType(ShipType type) {
        this.type = type;
    }

    public ArrayList<ShipPart> getShipParts() {
        return shipParts;
    }

    /*public void setShipParts(ShipPart[] shipParts) {
        this.shipParts = shipParts;
    }*/

    public boolean IsSunk() {

        for (int i = 0; i < shipParts.size(); i++) {
            if (!shipParts.get(i).isHit()) {
                return false;
            }
        }

        return true;
    }

    /*public void sink() {
        Sunken = true;
    }*/
}
