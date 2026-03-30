public class Tile {

    private boolean isShipPart = false;
    private boolean isRevealed = false;
    private boolean isHit = false;

    public boolean getShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    public boolean getRevealed() {
        return isRevealed;
    }

    public void toggleRevealed() {
        isRevealed = !isRevealed;
    }

    public boolean getHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
