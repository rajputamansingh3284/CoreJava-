public class ScopeDemo {
    int x = 10;   // Instance variable
    public void display() {
        int y = 20;   // Local variable
        if (true) {
            int z = 30;   // Block variable
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // System.out.println(z); // Error: z is not accessible here
    }
    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.display();
    }
}


shch soja pwsy uqyi