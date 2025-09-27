public class doWhile {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 8) {
            System.out.print(num);
            num++;  // increment to avoid infinite loop
        }
    }
}
