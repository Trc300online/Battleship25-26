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

    public String toStringPublic() {

        if (isRevealed == false) {
            return "\uD83C\uDF2B\uFE0F\u200B";
        }
        if (isRevealed == true && hasShip() == false) {
            return "\uD83C\uDF0A\u200B";
        }
        if (isRevealed == true && hasShip() == true) {
            return "\uD83D\uDCA5\u200B";
        }

        return null;
    }

    public String toStringPrivate() {

        if (hasShip() == false) {
            return "\uD83C\uDF0A\u200B";
        }
        if (hasShip() == true) {
            return "\uD83D\uDEA2\u200B";
        }
        if (getShipPart().isHit()) {
            return "\uD83D\uDCA5\u200B";
        }

        return null;
    }
}


