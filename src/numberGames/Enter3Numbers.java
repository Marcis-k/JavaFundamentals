package numberGames;

import java.util.Scanner;

public class Enter3Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 random numbers!!");

        System.out.print("Enter 1. number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter 2. number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter 3. number: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("The number 1. is the biggest - " + number1);
        }
        if (number2 > number1 && number2 > number3){
            System.out.println("The number 2. is the biggest - " + number2);
        }
        if (number3 > number1 && number3 > number2){
            System.out.println("The number 3. is the biggest - " + number3);
        }


    }


}
