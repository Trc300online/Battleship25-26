import java.util.Scanner;

public class Game {

    public Player[] playerList = new Player[2];
    private int turnCounter = 0;


    public void playGame() {

        boolean gameContinue = true;
        playerList[0] = new Player(Screen.askPlayerName(), new Board());
        playerList[1] = new Player(Screen.askPlayerName(), new Board());

        while (gameContinue) {
            Screen.printPublicBoard(playerList[(turnCounter+1)%2].getPlayerBoard());
            Screen.printPrivateBoard(playerList[turnCounter%2].getPlayerBoard());
            int[] coords = getAction();
            doAction(coords);
            gameContinue = checkWin(playerList[(turnCounter+1)%2].getPlayerBoard());
            turnCounter++;
        }
    }

    private boolean checkWin(Board playerBoard) {

        for (int i = 0; i < playerBoard.getShipList().size(); i++) {
            if (!playerBoard.getShipList().get(i).IsSunk()) {
                return true;
            }
        }

        return false;
    }

    public int[] getAction() {

        int[] coords = new int[2];

        Scanner s1 = new Scanner(System.in);
        Screen.askCoords();
        coords[0] = s1.nextInt() -1;
        Scanner s2 = new Scanner(System.in);
        Screen.askCoords();
        coords[1] = s2.nextInt() -1;

        if (!inBoard(coords)) {
            Screen.errorHandler(1);
            return getAction();
        }
        return coords;
    }

    private boolean inBoard(int[] coords) {
        if (coords[0] >= 0 && coords[0] <= playerList[(turnCounter+1)%2].getPlayerBoard().getBoardInsight().length-1 && coords[1] >= 0 && coords[1] <= playerList[(turnCounter+1)%2].getPlayerBoard().getBoardInsight()[0].length-1) {
            return true;
        }
        return false;
    }

    public void doAction(int[] coords) {
        playerList[(turnCounter+1)%2].getPlayerBoard().getBoardInsight()[coords[0]][coords[1]].bombed();

        if (playerList[(turnCounter+1)%2].beenShot(coords)) {
            playerList[(turnCounter+1)%2].getPlayerBoard().getBoardInsight()[coords[0]][coords[1]].getShipPart().setHit();

            if (playerList[(turnCounter+1)%2].getPlayerBoard().getBoardInsight()[coords[0]][coords[1]].getShipPart().getPare().IsSunk()) {
                Screen.sunkMsg(playerList[(turnCounter+1)%2].getPlayerBoard().getBoardInsight()[coords[0]][coords[1]].getShipPart().getPare().getType());
            }
        }
    }
}