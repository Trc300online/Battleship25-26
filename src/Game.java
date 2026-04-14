public class Game {

    public Player[] playerList = new Player[2];

    public void playGame() {

        boolean gameContinue = true;
        int turnCounter = 2;
        playerList[0] = new Player(Screen.askPlayerName(), new Board());
        playerList[1] = new Player(Screen.askPlayerName(), new Board());

        while (gameContinue) {
            Screen.printPublicBoard(playerList[(turnCounter+1)%2].getBoard());
            Screen.printPrivateBoard(playerList[turnCounter%2].getBoard());
            //player action
            int[] coords = getAction();
            doAction(coords);
            //gameContinue = checkWin(playerList[(turnCounter+1)%2].getBoard()) --> this methode checks if rival board has all ship sunk/shipParts hitted.
        }
    }

    public int[] getAction() {
        
    }
}


/*
playerList[turnCounter%2] --> current player
playerList[(turnCounter+1)%2]  --> other player
*/
