class Student {
    String name;
    // Constructor
    Student(String n) {
        name = n;
    }
 void display() {
        System.out.println("Name: " + name);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Nannehelal");
        s1.display();
    }
}
