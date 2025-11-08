import java.util.Scanner;
public class CaseCheck {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
char ch = sc.next().trim().charAt(1);

// System.out.println(sc.next().trim());

// System.out.println(ch);
if (ch >= 'a'&& ch<= 'z'){
    System.out.println("Lowercase.");
}else{
    System.out.println("UpperCase.");
}


   } 
}
