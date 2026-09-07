
//-------------- Inheritance ---------------
class Animal {

    void eats() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println(" Dog is barking");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eats();
        d.bark();
    }
}
