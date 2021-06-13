package arrayTraning;

import java.util.Scanner;

public class PrintOutNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

         fromNumberTo0(num);

    }

    private static void fromNumberTo0(int num) {
        if (num >= 0) {
            for (int i = num; i >= 0; i--) {
                System.out.println(i);
            }
        }else {
            for( int i = num; i<=0;i++){
                System.out.println(i);
            }
        }
    }
}
