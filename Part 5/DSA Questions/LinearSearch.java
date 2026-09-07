public class LinearSearch{

public static int linearSearch(int []arr , int target){
for(int i = 0; i<arr.length; i++){
    if( arr[i] == target){
        return i;
    }
    
}
return -1;
}


    public static void main(String[] args) {
         
        int[] nums  =  {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;

        int result   = linearSearch(nums, target);

        if(result != -1){
            System.out.println("target found at index at : "+ result );
        }else{
            System.out.println("target not found");
        }
    }
}