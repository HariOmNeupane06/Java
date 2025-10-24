import java.util.Scanner;
public class if_Else {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary: ");
    int salary = sc.nextInt();
    int bonus;
    
    if (salary >=25000 ){
        bonus =2000 ; 
    }else{
        bonus = 1000;
    }
    int result = salary + bonus;
  System.out.println("the total salary with bonus is :-" + result);
}
}
// if our salary is greater than 25000 then add bonus 2000, otherwise add bonus 1000.