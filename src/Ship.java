public class Ship {

    private int[] headPosition = new int[2];
    private Direction direction;
    private ShipType type;
    private ShipPart[] shipParts;
    private boolean Sunken = false;

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

    public ShipPart[] getShipParts() {
        return shipParts;
    }

    public void setShipParts(ShipPart[] shipParts) {
        this.shipParts = shipParts;
    }

    public boolean IsSunk() {

        for (int i = 0; i < shipParts.length; i++) {
            if (!shipParts[i].isHit()) {
                return false;
            }
        }

        return true;
    }

    public void sink() {
        Sunken = true;
    }
}
