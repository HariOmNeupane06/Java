// 🌱 What is a Loop?

// A loop is used when you want to repeat a block of code multiple times until a condition becomes false.


// while loop --> when we dont know how many times loops is going on, at that time we use. 
// for loop --> when we know hou many times to run , at that time we use for loop. 

import java.util.Scanner;
public class LoopsBasics {
    public static void main(String[] args) {
        // if(true){
        //     System.out.println("hello world");
        // }

        // for(int i=0; i<=10; i++){
        //     System.out.println(i);
    
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is a Even.");
        } else {
            System.out.print(num + " is a Odd.");
        }

        sc.close();




    }
}
