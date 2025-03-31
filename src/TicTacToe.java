import java.util.Scanner;

public class TicTacToe {

    public static void gameField() {
        
    }

    public static void main(String[] args) throws Exception {
        final int GRID_SIZE = 3;
        Scanner scan = new Scanner(System.in);

        int row = 0;
        int col = 0;

        System.out.println("Hello operator, welcome to TicTacToe!");
        System.out.println("Please read the rules below and enjoy your game!");

        String[][] drawBoard = new String[3][3];

        for (row = 0; row < drawBoard.length; row++) {
            for (col = 0; col < drawBoard.length; col++) {
                drawBoard[row][col] = " ";
                System.out.print("[" + drawBoard[row][col] + "]");
            }
            System.out.println();

        }
        drawBoard[0][2] = "x";
    }
}
