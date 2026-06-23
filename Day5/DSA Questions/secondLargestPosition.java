
public class secondLargestPosition {

    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };

        int output = position(arr);
        System.out.println(output);
    }

    // Method 
    static int position(int[][] arr) {

        int largest = Integer.MIN_VALUE;
          int first_row = -1;
          int first_col = -1;

        int Sec_largest = Integer.MIN_VALUE;
          int Sec_row = -1;
          int Sec_col = -1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int num = arr[row][col];

                if(num>largest){
                    Sec_largest = largest;
                    Sec_row = first_row;
                    Sec_col = first_col;


                    largest = num;
                    first_row= row;
                    first_col = col;

                }
            }
        }

        return Sec_largest;

    }

}
