public class BinarySearch {
    public static void main(String[] args) {
        
// Binary Search :-  array must be sorted.

int [] numbers =  {10, 20, 30, 40, 50, 60, 70 };
int key = 50; 
int start = 0;
int last =  numbers.length-1;

boolean found = false;

while( start <= last  ){

    int mid = (start + last)/2;

    if(numbers[mid] == key){
        System.out.println("number found at index:- "+ mid);
        found = true; 
        break;
    }


    else if(key> numbers[mid]){
        start = mid+1;
    }
    else{
        last = mid-1 ; 
    }
}

if (!found ){
    System.out.print("element not found");
}



    }
}
