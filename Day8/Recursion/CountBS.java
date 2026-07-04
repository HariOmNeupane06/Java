public class CountBS {
    public static void main(String[] args) {
         // counting the Binary Search using recursive call

         int []arr = {10, 20, 30, 40, 50, 60, 70};
         int target = 80;
    }
    static int search(int []arr, int target, int s , int e  ){

        int count = 0;

        if(s > e ){
            return -1;
        }

        int mid = s+(e-s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr,target , s, mid-1);
        }

        return

    }



}
