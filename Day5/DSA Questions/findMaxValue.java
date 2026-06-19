
public class findMaxValue {

 //  Method
 public static int findMax(  int []arr){

 int maxValue  = arr[0];  // define the max value
 
for(int i = 0; i < arr.length ; i++){

    if(arr[i] >  maxValue){
         maxValue = arr[i];
        
    }
    
}
return maxValue;
 }

    public static void main(String[] args) {
      int[] nums = {10, 45, 3, 99, 120};
      int result = findMax(nums);

      System.out.println("Maximum value is :" + result);
    }
}
