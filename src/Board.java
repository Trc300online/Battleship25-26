import java.util.Random;

public class Board {
    private Tile[][] board = new Tile[10][10];

    public Board() {
        generateBoard();
        populateBoard();
    }

    private void generateBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = new Tile();
            }
        }
    }

    private void populateBoard() {
        int count = 0;
        while (count < Ship.shipsLenght.length) {
            int y = new Random().nextInt(5);
            int x = new Random().nextInt(5);
        }
    }

    private boolean spaceFree(int y, int x, int i) {
        for (int a = 0; a < i; a++) {
            if (board[y][x+a].getShip()) {
                return false;
            }
        }
        return true;
    }
}
