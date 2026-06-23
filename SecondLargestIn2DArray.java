
public class SecondLargestIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };

        int output = ans(arr);
        System.out.println((output));
    }

// Method 
    static int ans(int[][] arr) {
        int largestValue = Integer.MIN_VALUE;
        int secondLargestValue = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int num = arr[row][col];
                if (num > largestValue) {
                    secondLargestValue = largestValue;
                    largestValue = num;
                }
            }

        }
        return secondLargestValue;

    }
}
