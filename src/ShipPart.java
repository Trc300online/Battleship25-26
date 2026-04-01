public class ShipPart {

    private int[] position;
    private boolean isHit = false;
    private ShipType pare;

    public boolean isHit() {
        return isHit;
    }

    public ShipType getPare() {
        return pare;
    }

    public int[] getPosition() {
        return position;
    }

    public void setHit() {
        isHit = true;
    }

    public void setPare(ShipType pare) {
        this.pare  = pare;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
