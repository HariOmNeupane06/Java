import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner  sc =  new Scanner(System.in);

        while (true) {

            System.out.println("\n=========== Student Management System ===========");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");


            System.out.println("Enter Your Choice: ");
            int choice =sc.nextInt();

            switch (choice) {
              case 1:
                    System.out.println("Add Student");
                    break;

                case 2:
                    System.out.println("View Students");
                    break;

                case 3:
                    System.out.println("Search Student");
                    break;

                case 4:
                    System.out.println("Update Student");
                    break;

                case 5:
                    System.out.println("Delete Student");
                    break;

                case 6:
                    System.out.println("Exit \n ===Thank you!===");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
            
        }







    }
}
