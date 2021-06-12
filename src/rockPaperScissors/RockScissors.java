package rockPaperScissors;

import java.util.Locale;
import java.util.Scanner;

public class RockScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "yes";

        while (playAgain.equals("yes")) {

            System.out.println("Player 1. input");
            String player1 = scanner.next().toLowerCase().trim();

            System.out.println("Player 2. input");
            String player2 = scanner.next().toLowerCase().trim();

            rockPaperScissors(player1, player2);

            System.out.println("Play again? yes/no");
            playAgain = scanner.next().toLowerCase(Locale.ROOT).trim();
        }

    }

    private static void rockPaperScissors(String player1, String player2) {

        if (player1.equals("rock") && player2.equals("rock") ||
                player1.equals("paper") && player2.equals("paper") ||
                player1.equals("scissors") && player2.equals("scissors")) {
            System.out.println("\uD83D\uDE47 TIE \uD83D\uDE47");
        } else if (player1.equals("rock") && player2.equals("scissors") ||
                player1.equals("paper") && player2.equals("rock") ||
                player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("\uD83C\uDF89 Player 1 wins \uD83C\uDF89 ");
        } else if (player1.equals("scissors") && player2.equals("rock") ||
                player1.equals("rock") && player2.equals("paper") ||
                player1.equals("paper") && player2.equals("scissors")) {
            System.out.println("\uD83C\uDF89 Player 2 wins \uD83C\uDF89");
        } else {
            System.out.println("Entered incorrectly");
        }


    }
}
