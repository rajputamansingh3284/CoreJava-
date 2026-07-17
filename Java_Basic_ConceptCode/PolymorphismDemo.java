// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
// Child Class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
// Main Class
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, Child object
        a.sound();            // Calls Dog's sound() method
    }
}
