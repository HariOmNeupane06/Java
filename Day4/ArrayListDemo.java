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
    }
}