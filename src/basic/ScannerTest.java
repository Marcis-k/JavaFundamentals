package basic;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("insert birth year:");
        int birthYear = scanner.nextInt();

        System.out.println("Insert your Name:");
        String name = scanner.nextLine();

        System.out.println("Insert your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Your birth Year is - " + birthYear);
        System.out.println("Your name is - " + name);
        System.out.println("You are " + (2021 - birthYear) + " old");
        System.out.println("Your surname is - " + surname);

    }
}
