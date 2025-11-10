import java.util.Scanner;
public class SwitchCase {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String fruit = sc.next();

    switch(fruit){

        case "Mango":
        System.out.println(" best fruit");
        break;

        case "banana":
        System.out.println(" a large fruit");
        break;

        case "watermelon":
        System.out.println(" watery fruit");
        break;

        case "grapes":
        System.out.println(" black ball fruit");
        break;

        default:
        System.out.println("Sorry!! Please enter a valid fruit name");
    }



   } 
}
