// File Name: TicTacToeMain.java
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner sc = new Scanner(System.in);
        boolean won = false;

        System.out.println("=== Tic-Tac-Toe Game ===");
        game.printBoard();

        while(!game.isBoardFull() && !won) {
            System.out.println("Player " + game.getCurrentPlayer() + "'s turn.");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            if(game.makeMove(row, col)) {
                game.printBoard();
                if(game.checkWin()) {
                    System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                    won = true;
                } else {
                    game.changePlayer();
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        if(!won) System.out.println("It's a draw!");
        sc.close();
    }
}
