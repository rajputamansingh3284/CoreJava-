class pro1 {
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
        pro1 obj = new pro1();
        obj.display();
    }
}
