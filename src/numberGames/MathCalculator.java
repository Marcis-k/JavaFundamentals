package numberGames;

public class MathCalculator {
    public static void main(String[] args) {

        System.out.println(add(5, 3));
        System.out.println(sub(10, 5));
        System.out.println(mult(3, 6));
        System.out.println(div(100, 25));
        System.out.println(compere(10, 8));

    }


    private static int div(int a, int b) {
        return a / b;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int sub(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static boolean compere(int a, int b) {
        if (a >= b) {
            return true;
        }
        return false;
    }

}
