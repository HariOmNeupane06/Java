public class doWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 12) {
            System.out.println("Number: " + i);
            i++;  // increment to avoid infinite loop
        }
    }
}
