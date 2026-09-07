
public class WrapperExample {

    public static void main(String[] args) {
        int num = 100;          // Primitive data type

        Integer obj = num;      // Autoboxing

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);
        System.out.println("--------------------------------------");

        //  final Keyword 
        //  -->  We cannot  change the value of Final keyword  after decalare once.  below here  bonus  is 2 . then i will be remains same .
        final int bonus = 2;

        System.out.println(bonus);

    }

}
