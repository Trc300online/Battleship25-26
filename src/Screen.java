import java.util.Scanner;

public class Screen {

    public static String askPlayerName() {
        String name;

        Scanner s = new Scanner(System.in);
        System.out.println("What's your name?");
        name = s.next();

        return name;
    }

    public static void askCoords() {

        System.out.println("Where do you want to shoot?");
    }

    public static void sunkMsg(ShipType type) {
        System.out.println("Congrats!! u have sunk a " + type);
    }

    public static void printPublicBoard(Board playerBoard) {

        for (int i = 0; i < playerBoard.getBoardInsight().length; i++) {
            for (int j = 0; j < playerBoard.getBoardInsight()[0].length; j++) {
                System.out.println(playerBoard.getBoardInsight()[i][j].toStringPublic());
            }
        }
    }

    public static void printPrivateBoard(Board playerBoard) {

        for (int i = 0; i < playerBoard.getBoardInsight().length; i++) {
            for (int j = 0; j < playerBoard.getBoardInsight()[0].length; j++) {
                System.out.println(playerBoard.getBoardInsight()[i][j].toStringPrivate());
            }
        }
    }
}
