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

public class part1{
    static  void sum(int a , int b){
         int result =  a+b;
         System.out.println(result);
    }
    public static void main(String[] args) {
        sum(2,4);
    }
}