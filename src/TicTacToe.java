import java.util.Scanner;

public class TicTacToe {

    public static void gameField(String[][] variableArray) {

        for (int row = 0; row < variableArray.length; row++) {
            for (int col = 0; col < variableArray.length; col++) {
                System.out.print("[" + variableArray[row][col] + "]");
            }
            System.out.println();
        }
    }

    public static boolean winCheck(String[][] winArray) {
        // all x wins
        if (winArray[0][0] == "x" && winArray[1][0] == "x" && winArray[2][0] == "x") {
            return true;
        } else if (winArray[0][1] == "x" && winArray[1][1] == "x" && winArray[2][1] == "x") {
            return true;
        } else if (winArray[0][2] == "x" && winArray[1][2] == "x" && winArray[2][2] == "x") {
            return true;
        } else if (winArray[0][0] == "x" && winArray[0][1] == "x" && winArray[0][2] == "x") {
            return true;
        } else if (winArray[1][0] == "x" && winArray[1][1] == "x" && winArray[1][2] == "x") {
            return true;
        } else if (winArray[2][0] == "x" && winArray[2][1] == "x" && winArray[2][2] == "x") {
            return true;
        } else if (winArray[0][0] == "x" && winArray[1][1] == "x" && winArray[2][2] == "x") { // diagonal x wins
            return true;
        } else if (winArray[0][2] == "x" && winArray[1][1] == "x" && winArray[2][0] == "x") {
            return true;
        }
        // all o wins
        if (winArray[0][0] == "o" && winArray[1][0] == "o" && winArray[2][0] == "o") {
            return true;
        } else if (winArray[0][1] == "o" && winArray[1][1] == "o" && winArray[2][1] == "o") {
            return true;
        } else if (winArray[0][2] == "o" && winArray[1][2] == "o" && winArray[2][2] == "o") {
            return true;
        } else if (winArray[0][0] == "o" && winArray[0][1] == "o" && winArray[0][2] == "o") {
            return true;
        } else if (winArray[1][0] == "o" && winArray[1][1] == "o" && winArray[1][2] == "o") {
            return true;
        } else if (winArray[2][0] == "o" && winArray[2][1] == "o" && winArray[2][2] == "o") {
            return true;
        } else if (winArray[0][0] == "o" && winArray[1][1] == "o" && winArray[2][2] == "o") { // diagonal o wins
            return true;
        } else if (winArray[0][2] == "o" && winArray[1][1] == "o" && winArray[2][0] == "o") {
            return true;
        }

        return false;
    }

    public static boolean drawCheck(String[][] drawArray) {
        int row;
        int col;

        for (row = 0; row < drawArray.length; row++) {
            for (col = 0; col < drawArray.length; col++) {
                if (drawArray[row][col] == " ") {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int playerRowMove;
        int playerColMove;
        boolean checkForWin = false;
        boolean checkForDraw = false;
        boolean notValid = true;

        System.out.println("Hello operator, welcome to TicTacToe!");
        System.out.println("Please read the rules below and enjoy your game!");
        System.out.println(" - Player 1 will be x, and player two will be o, taking turns after eachother.");
        System.out.println(
                " - A win occurs when either player fills out out a row, column or diagonal with their letter on the game field.");
        System.out.println(" - A draw occurs when all spaces are filled out by the players.");
        System.out.println(" - Most importantly, Have fun!");

        String[][] markArray = new String[3][3];

        for (int row = 0; row < markArray.length; row++) {
            for (int col = 0; col < markArray.length; col++) {
                markArray[row][col] = " ";
                System.out.print("[" + markArray[row][col] + "]");
            }
            System.out.println();
        }

        while (true) {
            // player 1 turn
            while (notValid == true) {
                while (true) {
                    System.out.println("Player 1, enter your row - column move: (0 1 2)");
                    playerRowMove = scan.nextInt();

                    switch (playerRowMove) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Enter an input inside the array, please.");
                            continue;
                    }

                    playerColMove = scan.nextInt();

                    switch (playerColMove) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Enter an input inside the array, please.");
                            continue;
                    }

                    break;
                }

                if (markArray[playerRowMove][playerColMove] == " ") {
                    notValid = false;
                    markArray[playerRowMove][playerColMove] = "x";

                } else {
                    System.out.println("Invalid move");
                }

                notValid = true;

                gameField(markArray);

                checkForWin = winCheck(markArray);

                if (checkForWin == true) {
                    System.out.println("Player 1 wins the game");
                    scan.close();
                    break;
                }

                checkForDraw = drawCheck(markArray);

                if (checkForDraw == true) {
                    System.out.println("Draw!");
                    scan.close();
                    break;
                }

                // player 2 turn
                while (notValid == true) {
                    while (true) {
                        System.out.println("Player 2, enter your row - column move: (0 1 2)");
                        playerRowMove = scan.nextInt();

                        switch (playerRowMove) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Enter an input inside the array, please.");
                                continue;
                        }

                        playerColMove = scan.nextInt();

                        switch (playerColMove) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Enter an input inside the array, please.");
                                continue;
                        }

                        break;
                    }

                    if (markArray[playerRowMove][playerColMove] == " ") {
                        notValid = false;
                        markArray[playerRowMove][playerColMove] = "o";
                    } else {
                        System.out.println("Invalid move");
                    }
                }

                notValid = true;

                gameField(markArray);

                checkForWin = winCheck(markArray);

                if (checkForWin == true) {
                    System.out.println("Player 2 wins the game");
                    scan.close();
                    break;
                }

                checkForDraw = drawCheck(markArray);

                if (checkForDraw == true) {
                    System.out.println("Draw!");
                    scan.close();
                    break;
                }
            }
            break;
        }
    }
}
