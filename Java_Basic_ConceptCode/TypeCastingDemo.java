public class TypeCastingDemo {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("Implicit Type Casting (Widening):");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);
        // Explicit Type Casting (Narrowing)
        double d = 25.75;
        int i = (int) d;
        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("Double value: " + d);
        System.out.println("Converted to int: " + i);
    }
}
