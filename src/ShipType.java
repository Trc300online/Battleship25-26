public enum ShipType {
    CARRIER (5,     2), // == 0
    BATTLESHIP (4,  3), // == 1
    CRUISER (3,     4),
    SUBMARINE (3,   3),
    DESTROYER (2,   5); // == 4

    private final int size;
    private final int amount;

    ShipType(int size, int amount) {
        this.size = size;
        this.amount = amount;
    }

    public int getSize() {
        return size;
    }

    public int getAmount() {
        return amount;
    }

    public static int getTotalAmount() {
        int totalShips = 0;
        for (ShipType ship : ShipType.values()) {
            totalShips += ship.getAmount();
        }
        return totalShips;
    }

    public static int getTotalSize() {
        int totalSize = 0;
        for (ShipType ship : ShipType.values()) {
            totalSize += ship.getSize();
        }
        return totalSize;
    }
}
