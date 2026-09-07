
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Original ArrayList: " + fruits);

        // Access an element
        System.out.println("First fruit: " + fruits.get(0));

        // Update an element
        fruits.set(1, "Orange");
        System.out.println("After updating Banana to Orange: " + fruits);

        // Remove an element
        fruits.remove(0);
        System.out.println("After removing Apple: " + fruits);

        // Get size
        System.out.println("Number of fruits: " + fruits.size());

        // Loop through ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);

        }
        System.out.println("=========================================================");

// q1. Creates an ArrayList<String> called colors.
// Adds the colors "Red", "Blue", and "Green".
// Prints all the colors using a loop.
// Prints the total number of colors using size().
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red ");
        colors.add("Blue ");
        colors.add("Green ");

        for (String result : colors) {
            System.out.println(result);
        }

        System.out.println("The total numbers of colors are: " + colors.size());

        System.out.println("=========================================================");

//              Q.no 2
//  Creates an ArrayList<Integer> with:   10, 25, 8, 50, 15, 20
// Prints all numbers.
// Finds the largest number.
// Calculates the sum of all numbers.
// Counts how many numbers are even.
// Checks if 50 exists in the list.
// Removes 8 from the list.
// Prints the updated list.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(8);
        numbers.add(50);
        numbers.add(15);
        numbers.add(20);

// Print all Numbers
        for (int printAllNumbers : numbers) {
            System.out.print(printAllNumbers + "  ");
        }
// finding Largest Number

        int largest = numbers.get(0);

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(" ");
        System.out.println("the largers number is: " + largest);

// calculate all numbers.
        int sum = 0;
        for (int addNumber : numbers) {
            sum = sum + addNumber;
        }
        System.out.println("The sum of all number:- " + sum);

// count even number
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }

        }
        System.out.println("there are " + evenCount + " even numbers.");

// print if 50 exists 
      if(numbers.contains(50)){
        System.out.println("\n yes! 50 is present");
      }else{
        System.out.println("\n 50 is not present");
      }
    

        numbers.remove(Integer.valueOf(8));
        System.out.println(numbers);


//prints the update list
System.out.println("\nThe Updated List");
 for(int num: numbers){
    System.out.print(num  + "  ");
 }






    }
}
