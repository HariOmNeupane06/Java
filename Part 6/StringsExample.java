
public class StringsExample {

    public static void main(String[] args) {
        // String name1 = "Sidd";
        // String name2 = "Neupane";

// Scanner sc =  new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println(name);
// Concatenation
        String fName = "Hary";
        String lName = "Sharma";

        String fullName = fName + "@" + lName;
        System.out.println(fullName);
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
        System.out.println();

        System.out.println("------------------------------------------");

        String a = "ram";
        String b = "ram";

        // ==
        System.out.println(a == b);

        String x = new String("Ram");
        String y = new String("Ram");

        System.out.println(x == y);
        System.out.println(x.equals(y));

    }

// In this string and strings builder concept 
// strings are   Immutable
//             &
// string Builder are mutable   
}
