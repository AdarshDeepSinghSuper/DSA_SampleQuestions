package JAVAOOPS;

public class MyClass {
    private int x;
    private String message;

    // Default constructor
    public MyClass() {
        x = 0;
        message = "Hello, World!";
    }

    // Parameterized constructor with one parameter
    public MyClass(int value) {
        x = value;
        message = "Parameterized constructor with one parameter.";
    }

    // Parameterized constructor with two parameters
    public MyClass(int value, String msg) {
        x = value;
        message = msg;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        MyClass obj1 = new MyClass();                     // Default constructor
        MyClass obj2 = new MyClass(42);                   // Parameterized constructor with one parameter
        MyClass obj3 = new MyClass(10, "Custom message"); // Parameterized constructor with two parameters

        // Displaying values using getter methods
        System.out.println("obj1: x=" + obj1.getX() + ", message=" + obj1.getMessage());
        System.out.println("obj2: x=" + obj2.getX() + ", message=" + obj2.getMessage());
        System.out.println("obj3: x=" + obj3.getX() + ", message=" + obj3.getMessage());
    }
}

