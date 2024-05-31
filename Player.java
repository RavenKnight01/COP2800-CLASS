public class Player {
    static int score1 = 0; 
    static int score2 = 0; 
    static int player1Wins = 0;
    static int player1Losses = 0;
    static int player2Wins = 0;
    static int player2Losses = 0;
    static int tieCount = 0;

    public static void main(String[] args) {
        if (score1 > score2) {
            System.out.println("player1 wins");
            player1Wins++;
            player2Losses++;
        } else if (score1 < score2) {
            System.out.println("player2 wins");
            player2Wins++;
            player1Losses++;
        } else {
            System.out.println("tie");
            tieCount++;
        }
    }
}