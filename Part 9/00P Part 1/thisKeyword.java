
public class thisKeyword {

    String name;
    int age;

    thisKeyword(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);

    }

    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword("Harry", 20);

        obj.display();
    }

}


// Example 

// public class WrapperExample {
//     public static void main(String[] args) {
//         // Primitive data type
//         int num = 10;

//         // Autoboxing (primitive -> wrapper object)
//         Integer obj = num;

//         // Unboxing (wrapper object -> primitive)
//         int value = obj;

//         System.out.println("Primitive value: " + num);
//         System.out.println("Wrapper object: " + obj);
//         System.out.println("Unboxed value: " + value);
//     }
// }