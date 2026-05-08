public class LinearSearchArray {
    public static void main(String[] args) {
        int []numbers = {10, 20, 30, 40, 50 };

         int key =  20;

         boolean found = false;

         for (int i = 0; i<numbers.length; i++ ){
            if(numbers[i]== key ){
                System.out.println("Element found a index: "+ i);
                found = true;

                break;  //stop searching once the key found 
                
            } 
         }
if(!found){
    System.out.println("Element not found");
}

    }
}
