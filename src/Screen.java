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
            System.out.println();
            for (int j = 0; j < playerBoard.getBoardInsight()[0].length; j++) {
                System.out.print(playerBoard.getBoardInsight()[i][j].toStringPublic());
            }
        }
        System.out.println();
    }

    public static void printPrivateBoard(Board playerBoard) {

        for (int i = 0; i < playerBoard.getBoardInsight().length; i++) {
            System.out.println();
            for (int j = 0; j < playerBoard.getBoardInsight()[0].length; j++) {
                System.out.print(playerBoard.getBoardInsight()[i][j].toStringPrivate());
            }
        }
        System.out.println();
    }

    public static void errorHandler(int code) {
        if (code == 1) {
            System.out.println("coords out of battlefiled, aim again!!");
        }
        if (code == 2) {
            System.out.println("board too small, reduce the amount of ships to play with or increase the board size");
        }
    }
}
