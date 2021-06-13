package arrayTraning;

import java.util.Arrays;

public class ReverseArrayItems {
    public static void main(String[] args) {

        int[] array = {4,7,2,4,8,7,5,3,2,7,6};
        System.out.println("Original array: "+Arrays.toString(array));

        for (int i = 0; i < array.length / 2;i++){
            int tmp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length -1 -i] = tmp;
        }

       System.out.println("Reversed array: "+Arrays.toString(array));
    }
}
