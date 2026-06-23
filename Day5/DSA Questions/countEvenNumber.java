public class countEvenNumber {

public static int countEven(int[] arr){
    int evenNum = 0;
    for(int i = 0; i < arr.length; i++){
        if( arr[i] %2 == 0){
          evenNum++ ;  
        }
    }
    return  evenNum ;
}


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 8};

        int output = countEven(nums);
System.out.println("the even numbers are :- "+ output);

    }
}
