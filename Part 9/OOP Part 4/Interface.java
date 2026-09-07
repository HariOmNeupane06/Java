
/*
 // ---------------  Interface  ----------------
   These things may be completely different, but they must follow the same rule/capability.
in simple  :- In interface we have a  same code like all the animals  have sound but sound can be different like dog barks & cat meow.

   // ----------------- Abstract  ----------------
 -->   These things are related, and I want to share some code between them.
   In abstract its also like a interface which  all animal  have sound  but differents  style & in abstract another thing is  it have readymade code like  i.e  all animal is eating  .. that we called abstract

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
