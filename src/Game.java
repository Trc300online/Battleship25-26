import java.util.ArrayList;

public class Game {

    public ArrayList<Player> playerList = new ArrayList<>();

    public void playGame() {

        playerList.add(new Player(Screen.askPlayerName(), new Board()));
        playerList.add(new Player(Screen.askPlayerName(), new Board()));
    }
}
