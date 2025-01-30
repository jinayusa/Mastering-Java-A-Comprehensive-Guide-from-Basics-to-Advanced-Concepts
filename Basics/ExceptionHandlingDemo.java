//Handling runtime issues with exceptions.
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause an error
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
