
public class Sum_n_NaturalNumber {

    static void printSum(int i, int n, int sum) {             // in parameter we take variable, that changes with the level

        // Base Case 
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        // A first we complete our step  or work    i.e sum calculation 
        sum += i;

        // then after    call function 
        printSum(i + 1, n, sum);

    }

    public static void main(String[] args) {
        printSum(1, 5, 0);
    }

}
