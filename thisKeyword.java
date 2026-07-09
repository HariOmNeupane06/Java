
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
