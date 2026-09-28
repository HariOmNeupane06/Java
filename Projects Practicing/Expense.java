import java.util.ArrayList;
import java.util.Scanner;
public class Expense {

    double amount;
    String category;
    String description;
    String date;

    public void expAmt(double amount) {
        this.amount = amount;
        // System.out.print(amount);

    }

    public void expCategory(String Cate) {
        this.category = Cate;
        // System.out.print(Cate);

    }

    public void expDesc(String Desc) {
        this.description = Desc;
        // System.out.print(Desc);

    }

    public void expDate(String date) {
        this.date =  date;
        // System.out.print(date);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ArrayList<Expense> expenses = new ArrayList<>();
        Expense exp = new Expense();
        exp.expAmt(500);
        exp.expCategory("Food");
        exp.expDesc("Lunch");
        exp.expDate("24");
        expenses.add(exp);
        
        Expense exp2 = new Expense();
        exp2.expAmt(200);
        exp2.expCategory("Transport");
        exp2.expDesc("Bus");
        exp2.expDate("25");
        expenses.add(exp2);
        
        Expense exp3 = new Expense();
        exp3.expAmt(100);
        exp3.expCategory("Shopping");
        exp3.expDesc("Clothes");
        exp3.expDate("22");
        expenses.add(exp3);

        Expense  Expense1 = expenses.get(0);
        //making a variable for expenses
         Expense Expense2 = expenses.get(1);
         Expense Expense3 = expenses.get(2);
          

        // expenses.get(0);

        for (int i = 0; i < expenses.size(); i++) {
           Expense currentExp = expenses.get(i);
           System.out.println(currentExp.amount);
        }





        // For Amount
        System.out.print("Enter the amount:- ");
        double inputAmt = sc.nextDouble();

        //  for Category
        System.out.print("Enter the Category:- ");
        String inputCategory = sc.next();

        System.out.print("Enter the Decription:- ");
        String inputDesc = sc.next();

        System.out.print("Enter the Date:- ");
        String inputDate = sc.next();

        System.out.println("\n\n===== EXPENSE =====");
        System.out.println("Amount: " + inputAmt);
        System.out.println("Category: " + inputCategory);
        System.out.println("Description: " + inputDesc);
        System.out.println("Date: " + inputDate);

        
        exp.expAmt(inputAmt);

        exp.expCategory(inputCategory);

        exp.expDesc(inputDesc);

        exp.expDate(inputDate);


    }

}
