public class TestNum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 3, 8, 2, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " -- ");
                    count++;
                }

            }
            if (count > 1) {
                System.out.println(arr[i] + " - " + count);
                i += (count - 1);
            }
        }
    }
}
