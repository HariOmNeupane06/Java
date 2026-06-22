
public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int maxOutput = max(arr);
        System.out.println("    ");
        System.out.println("the maximum number in this matrix is :- " + (maxOutput));

    }
    // find max  

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];

                }
            }
        }
        return max;
    }

}
