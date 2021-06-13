package arrayTraning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoppyAnArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] array2 = new int[array.length];

        for (int i=0;i<= array.length-1;i++){
            array2[i]=array[i];
        }
        System.out.println("Original array: "+Arrays.toString(array));
        System.out.println("Copied array: "+Arrays.toString(array2));

    }
}
