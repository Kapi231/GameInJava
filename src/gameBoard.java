
public class gameBoard {
    public static char[][] Board = {{' ', '|', ' ', '|', ' '},
                                    {'-', '+', '-', '+', '-'},
                                    {' ', '|', ' ', '|', ' '},
                                    {'-', '+', '-', '+', '-'},
                                    {' ', '|', ' ', '|', ' '}};
    public static void gameBoardPrint() {

        System.out.println("Game has began\nPlayer 1 = X\nPlayer 2 = O");

        for (char[] row : Board) {
            for (char c : row) {
                System.out.print("  " + c);
            }
            System.out.println();
        }
    }

    public static Boolean winPatterns(Boolean check){
        //Player 1 win patterns
        if (Board[0][0] == playerInput.p1 && Board[0][2] == playerInput.p1 && Board[0][4] == playerInput.p1) {
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[2][0] == playerInput.p1 && Board[2][2] == playerInput.p1 && Board[2][4] == playerInput.p1) {
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[4][0] == playerInput.p1 && Board[4][2] == playerInput.p1 && Board[4][4] == playerInput.p1) {
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[0][0] == playerInput.p1 && Board[2][0] == playerInput.p1 && Board[4][0] == playerInput.p1) {
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[0][2] == playerInput.p1 && Board[2][2] == playerInput.p1 && Board[4][2] == playerInput.p1) {
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[0][4] == playerInput.p1 && Board[2][4] == playerInput.p1 && Board[4][4] == playerInput.p1){
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[0][0] == playerInput.p1 && Board[2][2] == playerInput.p1 && Board[4][4] == playerInput.p1){
            System.out.println("Player 1 wins");
            return check = true;
        }
        if (Board[0][4] == playerInput.p1 && Board[2][2] == playerInput.p1 && Board[4][0] == playerInput.p1) {
            System.out.println("Player 1 wins");
            return check = true;
        }

        //Player 2 win patterns
        if (Board[0][0] == playerInput.p2 && Board[0][2] == playerInput.p2 && Board[0][4] == playerInput.p2) {
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[2][0] == playerInput.p2 && Board[2][2] == playerInput.p2 && Board[2][4] == playerInput.p2) {
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[4][0] == playerInput.p2 && Board[4][2] == playerInput.p2 && Board[4][4] == playerInput.p2) {
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[0][0] == playerInput.p2 && Board[2][0] == playerInput.p2 && Board[4][0] == playerInput.p2) {
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[0][2] == playerInput.p2 && Board[2][2] == playerInput.p2 && Board[4][2] == playerInput.p2) {
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[0][4] == playerInput.p2 && Board[2][4] == playerInput.p2 && Board[4][4] == playerInput.p2){
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[0][0] == playerInput.p2 && Board[2][2] == playerInput.p2 && Board[4][4] == playerInput.p2){
            System.out.println("Player 2 wins");
            return check = true;
        }
        if (Board[0][4] == playerInput.p2 && Board[2][2] == playerInput.p2 && Board[4][0] == playerInput.p2) {
            System.out.println("Player 2 wins");
            return check = true;
        }
        return check = false;
    }
}
