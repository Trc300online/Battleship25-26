public class Tile {

    private ShipPart shipPart = null;
    private boolean isRevealed = false;

    public ShipPart getShipPart() {
        return shipPart;
    }

    public void setShipPart(ShipPart part) {
        shipPart = part;
    }

    public boolean getRevealed() {
        return isRevealed;
    }

    public void bombed() {
        isRevealed = true;
    }

    public boolean hasShip() {
        return (shipPart != null);
    }
}


