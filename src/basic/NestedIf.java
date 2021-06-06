package basic;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet skaitli: ");

        int input = scanner.nextInt();

        if (input >= 0) {
            System.out.println("Ievadītais skaitlis ir pozitīvs!");
            if (input > 50) {
                System.out.println("Ievadītais skaitlis ir lielaks par 50");
            } else {
                System.out.println("ievadītais skaitlis ir mazaks par 50");
            }
        } else {
            System.out.println("Ievadītais skaitlis ir negatīvs");
            if (input >= -50) {
                System.out.println("Ievadītais skaitlis ir lielāks par -50");
            } else {
                System.out.println("ievadītaiss skaitlis ir mazaks par -50");
            }
        }


    }


}
