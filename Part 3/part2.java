


public class part2 {

    static void greet() {                     // for no returns value &no parameters 
        System.out.println("Hello WORLD"); 
    }

    static void sum(int a, int b){          //  for no returns but having parameters
        System.out.println("the sum of two number is =  "+ a+b);
    }

    //  return value no para
    static int getNum(){
        return 10;
    }

    //  return but parama
    static int addNum(int a, int b) {
        return a+b;
        
    }

    public static void main(String[] args) {
        greet();          // no parameters

        sum(3,4);   //  but  having parameter

        int result = getNum();
      //   System.out.println(getNum());      // //  we can this also
      System.out.println(result);    

    int output =  addNum(10, 20);
        System.out.println(output);
    }
}
