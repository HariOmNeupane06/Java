public class TypeCasting {
 public static void main(String []args)   {
       //  Scanner  input =  new Scanner(System.in);
       //  float num = input.nextFloat();
       //   System.out.println(num); 

   
       // Type Casting 
       //  int num  =  (int )(67.66f);
      //  System.out.println(num);

       // automatic type promotion  in expressions
       // -> it means 
       //  int a = 255;
       //  byte b = (byte) (a);
       //  System.out.println(b);

     //  System.out.println("नमस्ते");         //  java is a unicode  can print anything.


     byte b = 42; 
     char c = 'a';
     short s = 1024; 
     int i = 50000;
     float f = 5.67f;
     double d =  0.1234;
     double result = (f * b) + (i / c) - (d * s);

       System.out.println(result);






 }
}
 