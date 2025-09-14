
public class MyClass {
    // Method to add two integers
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Returns the sum of a and b
    }

    // Method to display a greeting
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create an object of MyClass

        // Call the addNumbers method
        int result = obj.addNumbers(5, 3);
        System.out.println("Sum: " + result); // Output: Sum: 8

        // Call the greet method
        obj.greet("Alice"); // Output: Hello, Alice!
    }
}
