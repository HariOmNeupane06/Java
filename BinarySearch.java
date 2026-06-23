public class BinarySearch {

    public static void main(String[] args) {
       int []arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45} ;
       int target = -12;

       int  result = binarySearchMethod( arr, target);
       if(result != -1){
    System.out.println("Element found at index :- " + result);
       }else{
        System.out.println("Element not found");
       }


    }

    static int binarySearchMethod( int []arr , int target ){
        int start = 0;
        int end = arr.length -1 ;

        while (start <= end){
            int mid = start + (end - start)/2;
            


            if(arr [mid] == target){
                return mid ;  //  element found;
            


            }else if(arr[mid]>target){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        
        
        return -1;
    }
        }



