interface Vehicle {
    void start();
}
// First Class implementing Interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key.");
    }
}
// Second Class implementing Interface
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}
// Main Class
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}
