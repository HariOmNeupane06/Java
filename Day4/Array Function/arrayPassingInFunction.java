public class arrayPassingInFunction {

    // ======= for 1d =======
   // // array parameter, No return

    // public static void printArray(int[] arr) {

    //     for (int i = 0; i < arr.length; i++) {

    //         System.out.print(arr[i] + ", ");
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = {10, 20, 30, 40, 50};

    //     printArray(arr);

    // }



// Array parameter ,return
    public static int []printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

        arr[i] = arr[i] *2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        numbers = printArray(numbers);

        for(int i = 0; i< numbers.length; i++){
            System.out.print(numbers[i]+ "   ");
        }


    }






}
