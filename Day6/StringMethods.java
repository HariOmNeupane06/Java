import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "SIDD";
        System.out.println(Arrays.toString(name.toCharArray()));   //  given in arrays [s ,i ,d ,d]
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('D'));
        System.out.println("  SIDD " . strip()); //  cut both white spaces
        System.out.println("SIDD      ".stripLeading());  // cut the front white spaces
        System.out.println("            SIDD         ".stripTrailing());  // cut the back white spaces
        System.out.println(Arrays.toString (name.split(" ")));
    }

}
