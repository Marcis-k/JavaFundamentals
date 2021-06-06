package basic;

import java.util.Scanner;

public class NewNameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        String lastName;

        System.out.println("Insert your Name:");
        name = scanner.nextLine();

        System.out.println("Insert your last name:");
        lastName = scanner.nextLine();

        System.out.println("insert birth year:");
        age = scanner.nextInt();

        System.out.println("Your name ir - " + name);
        System.out.println("Your last name is - " + lastName);
        System.out.println("Your age ir - " + (2021 - age));
    }
}
