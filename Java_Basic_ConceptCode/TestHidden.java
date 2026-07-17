class HiddenClass {   // Not public, so it is hidden outside the package
    void display() {
        System.out.println("This is a hidden class.");
    }
}
public class TestHidden {
    public static void main(String[] args) {
        HiddenClass obj = new HiddenClass();
        obj.display();
    }
}
