package arrayTraning;

import java.util.Arrays;

public class MinAndMaxMethod {
    public static void main(String[] args) {
        int[] array = {3, 55, 66, 22, 86, 234, 87, 7, 10};
        System.out.println(Arrays.toString(array));
        System.out.println("Maximum value for the array: " + max(array));
        System.out.println("Minimum for the array: " + min(array));


    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static int max(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
