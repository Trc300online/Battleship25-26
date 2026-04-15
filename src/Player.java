public class Player {

    private String name;
    private Board board;

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public Board getPlayerBoard() {
        return board;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public boolean beenShot(int[] coords) {
        return (getPlayerBoard().getBoardInsight()[coords[0]][coords[1]].hasShip())
    }
}
