package Day10;
public class tryCatchExample {
    public static void main(String[] args) {
        int n = 10;
        int m = 0;
    
        try{
            int ans = n/m;
            System.out.println("answer "+ ans);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by 0!");
        } finally{
            System.out.println("Clean the code");
        }
    }
}
