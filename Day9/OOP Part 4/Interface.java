
/*
 // ---------------  Interface  ----------------
   These things may be completely different, but they must follow the same rule/capability.

   For eg:- Dog can Fly → implements

   // ----------------- Abstract  ----------------
 -->   These things are related, and I want to share some code between them.

 For eg:-  Dog is an Animal → extends 
 */
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println(" dog barks");
    }
}

public class Interface {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
