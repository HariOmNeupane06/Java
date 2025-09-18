import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number up to which you want prime numbers: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");

        for (int i = 2; i <= n; i++) { // Loop through each number from 2 to n
            boolean isPrime = true; // Assume the number is prime

            // Check divisibility from 2 to sqrt(i)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) { // If divisible by any number
                    isPrime = false; // Not prime
                    break; // Stop checking
                }
            }

            if (isPrime) { // If prime, print it
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
