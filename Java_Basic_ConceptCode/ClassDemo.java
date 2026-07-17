 class Student {
    // Data Members (Variables)
    String name;
    int rollNo;
    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
// Main Class
 public class ClassDemo {
    public static void main(String[] args) {
        // Creating Object of Student Class
        Student s1 = new Student();
        // Assigning Values
        s1.name = "Nannehelal";
        s1.rollNo = 104;
        // Calling Method
        s1.display();
    }
}
