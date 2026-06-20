
public class occurenceNumber {

    // Method 
    
    public static int countOccurrences(int[] arr, int target){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == 2){
                count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 2, 5,6,2, 2};
        int target = 2;

    int output = countOccurrences(nums, target);
    System.out.println("The occurence number is :- "+ output);
    }
}


