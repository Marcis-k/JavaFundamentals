package numberGames;

import java.util.Random;
import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu ievadiet skaitli");

        int input = 0;

        int number = (int) (Math.random() * input + 1);;

        while (number != input) {

            input = scanner.nextInt();
            System.out.println("Skaitlis ko uzģenerēja: " + number);
        }

    }
}
