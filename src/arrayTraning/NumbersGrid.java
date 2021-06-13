package arrayTraning;

public class NumbersGrid {
    public static void main(String[] args) {
        int[][] arr = {
                {4,8,1},
                {8,0,2},
                {6,3,8}
        };

        for (int i =0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
