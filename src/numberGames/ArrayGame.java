package numberGames;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size!");
        int sizeOfArray = scanner.nextInt();

        int[] arrayInt = new int[sizeOfArray];

        int sum = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter value " + (i+1) + ". ");
            int number = scanner.nextInt();
            arrayInt[i] = number;
            sum += number;
        }

        System.out.println("The entire array you entered - " + Arrays.toString(arrayInt));

        System.out.println("Sum of all array - " + sum);

        for (int i =0; i <=arrayInt.length-1 ;i++){    // Vēlviens variants ka izdrukāt
            System.out.print(arrayInt[i]+" ");
        }
    }
}
