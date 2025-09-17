import java.util.Scanner;
public class LoopsBasics {
    public static void main(String[] args) {
        // if(true){
        //     System.out.println("hello world");
        // }

        // for(int i=0; i<=10; i++){
        //     System.out.println(i);
        // 

        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        sc.close();
    



    }
}
