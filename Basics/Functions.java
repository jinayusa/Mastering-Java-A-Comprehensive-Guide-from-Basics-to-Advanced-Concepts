//This demonstrates the power of methods for code reuse and abstraction.
public class Functions {
    // A simple function with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // A function with no return value
    public static void greetUser() {
        System.out.println("Hello, Java Developer!");
    }

    public static void main(String[] args) {
        greetUser();
        int sum = addNumbers(5, 7);
        System.out.println("The sum is: " + sum);
    }
}
