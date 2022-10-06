import java.util.Scanner;

public class playerInput extends gameBoard {
    static char p1 = 'X';
    static char p2 = 'O';
    static char result = p1;

    public static void playerChose() {

        String player1Info = "Player 1 turn: ";
        String player2Info = "Player 2 turn: ";
        String notification = player1Info;

        Scanner src = new Scanner(System.in);

        for (int i = 1; i > 0; i++) {

            if (winPatterns(true)){
                break;
            }
            System.out.print(notification);
            String input = src.nextLine();
            int intInput = Integer.valueOf(input);

            switch (intInput) {
                case 1:
                    if (Board[0][0] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[0][0] == ' ') {
                        Board[0][0] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 2:
                    if (Board[0][2] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[0][2] == ' ') {
                        Board[0][2] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 3:
                    if (Board[0][4] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[0][4] == ' ') {
                        Board[0][4] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 4:
                    if (Board[2][0] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[2][0] == ' ') {
                        Board[2][0] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 5:
                    if (Board[2][2] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[2][2] == ' ') {
                        Board[2][2] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 6:
                    if (Board[2][4] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[2][4] == ' ') {
                        Board[2][4] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 7:
                    if (Board[4][0] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[4][0] == ' ') {
                        Board[4][0] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 8:
                    if (Board[4][2] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[4][2] == ' ') {
                        Board[4][2] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
                case 9:
                    if (Board[4][4] != ' ') {
                        System.out.println("ERROR");
                        gameBoardPrint();
                    } else if (Board[4][4] == ' ') {
                        Board[4][4] = result;
                        gameBoardPrint();
                        if (result == p1){
                            result = p2;
                            notification = player2Info;
                        } else if (result == p2){
                            result = p1;
                            notification = player1Info;
                        }
                    }
                    break;
            }

            if (Board[0][0] != ' ' && Board[0][2] != ' ' && Board[0][4] != ' ' &&
                    Board[2][0] != ' ' && Board[2][2] != ' ' && Board[2][4] != ' ' &&
                    Board[4][0] != ' ' && Board[4][2] != ' ' && Board[4][4] != ' ') {
                break;
            }
        }
        System.out.println("Over");
    }
}
