public class ShipPart {

    private int[] position = new int[2];
    private boolean isHit = false;
    private Ship pare;

    public ShipPart(int y, int x, Ship pare) {
        this.position[0] = y;
        this.position[1] = x;
        this.pare = pare;
    }

    public boolean isHit() {
        return isHit;
    }

    public Ship getPare() {
        return pare;
    }

    public int[] getPosition() {
        return position;
    }

    public void setHit() {
        isHit = true;
    }
}
