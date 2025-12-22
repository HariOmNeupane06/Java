import java.util.Scanner;
public class SwitchCase {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // String fruit = sc.next();

    // switch(fruit){

    //     case "Mango":
    //     System.out.println(" best fruit");
    //     break;

    //     case "banana":
    //     System.out.println(" a large fruit");
    //     break;

    //     case "watermelon":
    //     System.out.println(" watery fruit");
    //     break;

    //     case "grapes":
    //     System.out.println(" black ball fruit");
    //     break;

    //     default:
    //     System.out.println("Sorry!! Please enter a valid fruit name");
    // }


    int Emp_Id  =  sc.nextInt();
    String department = sc.next();
     
    switch (Emp_Id) {

        case 1:
            System.out.println("Sidd Neupane");
            break;

        case 2:
            System.out.println("Bishal Neupane");
            break;

        case 3:
        System.out.println("Employee no 3.");
        switch(department){

            case "IT":  
          
            System.out.println("IT Department");
            break;

            case "Management":
            System.out.println("Management Department");
            break;

            default:
            System.out.println("No department entered");

        }            
         break;
        default:
        System.out.println("Enter the correct Employees ID");
        break;
    }


   } 
}