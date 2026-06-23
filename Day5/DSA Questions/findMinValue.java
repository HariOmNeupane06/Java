public class findMinValue {
   
    public static int MinValue(int[] arr){
        int minValue = arr[0];
for(int i = 0;  i<arr.length; i++){
    if(arr[i]<minValue){
        minValue =arr[i];
    }
}
return minValue;
    }



    public static void main(String[] args) {
         int[] nums = {10, 45, 3, 99, 120};

         int output = MinValue(nums);


System.out.println("Minimum Value is :- " + output);

    }
}
