import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.nextLine();
        char[] charString = x.toCharArray();
        solution(x, charString);

        ;
    }

    public static void solution(String stdIn, char[] charString) {

        for (int i = 0; i < stdIn.length() - 1; i++) {
            if (i == 0 || i % 2 == 0) {
                System.out.print(charString[i]);
            }
        }
        System.out.print("  ");

        for (int i = 0; i < stdIn.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(charString[i]);
            }
        }
    }



}
