// ---------- Method Overloading ----------
// --> it means  having the same method but different parameter

class Calculator {

    // Having 2 parameter 
    int add(int a, int b) {
        return a + b;
    }
//Having  3 parameter but same  method

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}
