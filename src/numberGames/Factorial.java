package numberGames;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        System.out.println("The numberGames.Factorial of " + number + " is " + getFact(number));

    }

    private static int getFact(int a) {

        int fact = 1;
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
        } else {
            return 0;
        }
        return fact;
    }

}
