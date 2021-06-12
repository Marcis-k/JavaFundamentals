package palindrom;

import java.util.Locale;
import java.util.Scanner;

public class Palindroms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgein = "jā";

        while (playAgein.equals("jā")) {
            System.out.println("Lūdzu ievadiet vārdu");
            String input = scanner.nextLine().toLowerCase(Locale.ROOT).replaceAll(" ", "");

            System.out.println(isPalindrom(input));

            System.out.println("Vai spēlētiet vēl? jā/nē:");
            playAgein = scanner.next("jā").toLowerCase(Locale.ROOT);

            scanner.nextLine(); //lai appietu problemu

        }

    }

    public static boolean isPalindrom(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            input.charAt(input.length() - 1);
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
