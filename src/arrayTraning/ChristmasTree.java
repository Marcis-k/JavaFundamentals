package arrayTraning;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        tree(num);
    }

    private static void tree(int levels) {

        for (int i = 0; i < levels; i++) {
            //spaces
            for (int j = 0; j < levels - 1 - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int h = 0; h < i * 2 + 1; h++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < levels - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("£");

    }
}
