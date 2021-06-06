package numberGames;

import java.util.Scanner;

public class YearGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to know if its a leap year - ");

        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - is a leap year");
        } else {
            System.out.println(year + " - not a leap year");
        }
    }
}
