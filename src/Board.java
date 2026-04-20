import java.util.ArrayList;
import java.util.Random;

public class Board {
    private Tile[][] board = new Tile[10][10];
    private ArrayList<Ship> shipList = new ArrayList<>();

    public Board() {
        checkSize();
        generateBoard();
        populateBoard();
    }

    public Tile[][] getBoardInsight() {
        return board;
    }

    private void checkSize() {
        if (ShipType.getTotalSize() > (board.length * board[0].length)/2.5) {
            Screen.errorHandler(2);
            System.exit(0);
        }
    }

    private void generateBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = new Tile();
            }
        }
    }

    private void populateBoard() {
        int count = 0;
        int y;
        int x;
        for (ShipType ship : ShipType.values()) {
            while (count < ship.getAmount()) {
                Direction dir = (new Random().nextInt(2) > 0.5) ? Direction.HORIZONTAL : Direction.VERTICAL;

                if (dir == Direction.VERTICAL) {
                    y = new Random().nextInt(board.length - ship.getSize());
                    x = new Random().nextInt(board[0].length);
                } else {
                    y = new Random().nextInt(board.length);
                    x = new Random().nextInt(board[0].length - ship.getSize());
                }

                if (spaceFree(y, x, ship.getSize(), dir)) {
                    shipList.add(placeShip(y, x, ship, dir));
                    count++;
                }
            }
            count = 0;
        }
    }

    private Ship placeShip(int y, int x, ShipType ship, Direction dir) {
        int[] hPos = new int[2];
        hPos[0] = y;
        hPos[1] = x;
        Ship newShip =  new Ship(hPos, dir, ship);
        ArrayList<ShipPart> parts = newShip.getShipParts();

        for (int i = 0; i < parts.size(); i++) {
           int[] position = parts.get(i).getPosition();
           board[position[0]][position[1]].setShipPart(parts.get(i));
        }

        return newShip;
    }

    private boolean spaceFree(int y, int x, int size, Direction dir) {
        if (dir == Direction.VERTICAL) {
            for (int i = 0; i < size; i++) {
                if (board[y+i][x].hasShip()) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (board[y][x+i].hasShip()) {
                    return false;
                }
            }
        }

        return true;
    }

    public ArrayList<Ship> getShipList() {
        return shipList;
    }
}
