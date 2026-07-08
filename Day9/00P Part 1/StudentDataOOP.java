class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class StudentDataOOP{
    public static void main(String[] args) {
        Student s1 = new Student();   // Create object

        // Manipulate the object
        s1.name = "Harry";
        s1.age = 20;

        // Read the values
        System.out.println(s1.name);
        System.out.println(s1.age);

        // Call a method
        s1.display();
    }
}