class AccessDemo {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    // Public Method
    public void showPublic() {
        System.out.println(publicVar);
    }
    // Private Method
    private void showPrivate() {
        System.out.println(privateVar);
    }
    // Protected Method
    protected void showProtected() {
        System.out.println(protectedVar);
    }
    // Method to access private member within same class
    public void accessPrivate() {
        showPrivate();
    }
}
public class AccessSpecifierDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        // Accessing public member
        obj.showPublic();
        // Accessing protected member
        obj.showProtected();
        // Accessing private member through public method
        obj.accessPrivate();
    }
}
