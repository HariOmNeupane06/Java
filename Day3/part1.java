// public class part1 {
//  static void greet(){
//     System.out.println("Hello");
//  }
//     public static void main(String[] args) {
//         greet();
//     }
// }




//    value returning functions 

// public  class part1{
// static int sum(int a, int b){
//    int result =  a+b;
//    return result;
// }
   
// public static void main(String[] args) {
//     int input_Number = sum(34,12);
//     System.out.println(input_Number);
// }    
// }




// //    No argument but return value
// public class part1{
//     static  int givenNumber(){
//     return 10; 
//     }

//     public static void main(String[] args) {
//         int x =  givenNumber();
//         System.out.println(x);
//     }
// }



//   arguments but not return value

// public class part1{
//     static  void sum(int a , int b){
//          int result =  a+b;
//          System.out.println(result);
//     }
//     public static void main(String[] args) {
//         sum(2,4);   
//     }
// }



//  no argument no return value

// public class part1{
//     static void sayHello(){
//         System.out.println("hey namastey");
//     }
//     public static void main(String[] args) {
//         sayHello();    // call
//     }
// }



//     argument & return value

public class part1{
    static int add(int x , int y){
        return x+y;
    }
    public static void main(String[] args) {
        int output = add(4,6);
        System.out.println(output); 

        
    }
}