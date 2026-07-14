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



class Student {

    // Default constructor
    Student() {
        System.out.println("Constructor is called.");
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // Constructor is called automatically
    }
}