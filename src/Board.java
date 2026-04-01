import java.util.Random;

public class Board {
    private Tile[][] board = new Tile[10][10];

    public Board() {
        generateBoard();
        populateBoard();
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
        while (count < Ship.shipsLenght.length) {
            Direction dir = (new Random().nextInt(2) > 0.5) ? Direction.HORIZONTAL : Direction.VERTICAL;

            if (dir == Direction.VERTICAL) {
                int y = new Random().nextInt(board.length/2);
                int x = new Random().nextInt(board[0].length);
            } else {
                int y = new Random().nextInt(board.length);
                int x = new Random().nextInt(board[0].length/2);
            }
        }
    }

    // direccio = ( numero random > 0.5 ) ? horitzontal : vertical ;



}
