// import java.util.Scanner;
// public class game {

//     public static void main(String[] args) {

//         char [][] board=new char[3][3];
//         for(int row=0;row<board.length;row++){
//             for(int col=0;col<board[row].length;row++){
//                 board[row][col]=' ';
//             }
//         }

//         char player='X';
//         boolean gameover=false;
//         Scanner scanner=new Scanner(System.in);

        
//     }

//     //condition for game own condition
//     public static boolean gameown(char[][] board,char player){
//         for(int row=0;row< board.length;row++){
//             if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
//                 return true;
//             }
//         }

//         //for column
//         for(int col=0;col<board[0].length;col++){
//             if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
//                 return true;
//             }
            
//         }

//         //for diagonal
//         if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
//             return true;
//         }
//         if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
//             return true;
//         }
//           return false;

//     }
    
// }

import java.util.Scanner;

public class game {

    // Initialize the game board as a 3x3 grid
    private static char[][] board = new char[3][3];

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            initializeBoard();
            char currentPlayer = 'X';
            boolean gameWon = false;

            // Loop for the game rounds (maximum 9 moves)
            for (int i = 0; i < 9; i++) {
                printBoard();
                System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
                
                int row = scanner.nextInt() - 1;
                int col = scanner.nextInt() - 1;

                // Validate the move
                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
                    System.out.println("This move is not valid. Try again.");
                    i--; // retry the move
                    continue;
                }

                // Place the player's symbol on the board
                board[row][col] = currentPlayer;

                // Check for a win condition
                if (checkWin(currentPlayer)) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameWon = true;
                    break;
                }

                // Switch players
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }

            // If no one won, it's a draw
            if (!gameWon) {
                printBoard();
                System.out.println("The game is a draw!");
            }

            // Ask if the players want to play again
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        scanner.close();
        System.out.println("Thank you for playing!");
    }

    // Method to initialize the board with dashes ('-')
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Method to print the current state of the board
    private static void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if the current player has won
    private static boolean checkWin(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}

