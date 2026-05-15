import java.util.Arrays;
import java.util.Scanner;

public class typesOfArrays {

    public static void main(String[] args) {

        // declare an array 
           int[] numbers;

      // allocate memory (size = 5)
           numbers = new int[5];


     // Assign values
     numbers[0]=10;   // 0 is  index ,   but 1st element
     numbers[1]=20;
     numbers[2]=30;    //  2 is index 2nd , but 3rd element
     numbers[3]=40;
     numbers[4]=50;

     // print the values
     System.out.println("Array elements are: ");
     for(int i = 0; i<numbers.length; i++){
        System.out.println(numbers[i]);
     }
System.out.println("============================================");


// declaring the array in single dimensional array
 int [] arr =  {10, 20, 30, 40 };


// here we update the value of  index 2nd  is 35 after updating to 30;  so 30  is changed and  35 is set.
numbers [2] = 35;
for(int i =0; i<arr.length; i++){
System.out.println(numbers[i]);
}

System.out.println("============================================");


//  in for loop we using loop like this  ->    for(int i = 0; i< array.length; i++)

for (int i = 0; i < arr.length; i++) {
    System.out.println(numbers[i]);
}

// in for-each loop we using loop like this ->  for(num: array)

System.out.println("======================");
for(int array :numbers){
System.out.println(array);
}
System.out.println("============================");



    System.out.println("Length of array: -  " + numbers.length);
    System.out.println("1st element:-       "+ numbers[0]);

    int mid =  (numbers.length)/2;
    System.out.println("mid element:-       "+ numbers[mid] );
    System.out.println("last element:-      "+ numbers[numbers.length-1] );

System.out.println("========================================");

Scanner input = new Scanner(System.in);
String[] str = new String[5];

 for (int i = 0; i < str.length; i++) {
     str[i]= input.next();
 }
 System.out.println(Arrays.toString(str));














}
}
