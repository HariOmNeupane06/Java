
//------------------ Encapsulation -----------------------
class Student{
    private String name;

    public void setName(String Name){
this.name = Name;

    }
    public String GetName(){
        return name;
    }
    public static void main(String[] args) {
        Student s =  new Student();
        s.setName("Hari");
        System.out.println(s.GetName());
    }
}