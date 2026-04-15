public class ShipPart {

    private int[] position = new int[2];
    private boolean isHit = false;
    //private ShipType pare;
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

    /*public void setPare(ShipType pare) {
        this.pare  = pare;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }*/
}
