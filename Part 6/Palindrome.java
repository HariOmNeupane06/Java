
public class Palindrome {

    public static void main(String[] args) {

        String str = "123454321";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        str = str.strip();                  // strip() helps to  cut the front and back space in string. 
        if (str == null || str.length() == 0) {  // is string will be null " "   then it prints   true.
            return true;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }

        }
        return true;
    }

}
// a b c b a 
 // 0 1 2 3 4