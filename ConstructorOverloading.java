/* 
class ClassName {

    // Constructor 1
    ClassName() {
        // code
    }

    // Constructor 2
    ClassName(dataType parameter) {
        // code
    }

    // Constructor 3
    ClassName(dataType parameter1, dataType parameter2) {
        // code
    }
}

 */

//  Constructor Overloading
public class ConstructorOverloading {

    String name;
    int age;

    //  Default Constructor
    ConstructorOverloading() {
        name = " null";
        age = 0;
    }

    // Parameterized Constructor
    ConstructorOverloading(String n, int a) {

        this.name = n;
        this.age = a;
    }

    void Display() {
        if(name != null && ! name.isEmpty()){

            System.out.printf("%s is %d years old%n", name, age);
        }
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();  // for default
        ConstructorOverloading obj2 = new ConstructorOverloading("Harry", 21);  // for parameterized

        obj1.Display();
        obj2.Display();
    }

}
