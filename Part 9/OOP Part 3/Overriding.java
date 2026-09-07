
// -----------------  Method Overriding -------------------
class Animal {

    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {

    public static void main(String[] args) {
        Animal obj = new Dog();  //        Animal   object =  Dog 
        obj.sound();

    }
}
