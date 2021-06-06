package basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VaragsTest {

    public static void main(String[] args) {
        strudent("Janis", 3, 7, 5);


    }

    private static void strudent(String name, int... grades) {
        System.out.println("Student Name: " + name);
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            sum += grades[i];

        }

        System.out.println("Average - " + sum / grades.length);


    }


}
