//Define and use custom annotations in Java.
import java.lang.annotation.ElementType;              // Add this import
import java.lang.annotation.Retention;       // Add this import
import java.lang.annotation.RetentionPolicy;          // Add this import
import java.lang.annotation.Target;               // Add this import
import java.lang.reflect.Method;                  // Already imported for Method

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {
    String description() default "No description";
}

class MyClass {
    @CustomAnnotation(description = "This is an important method")
    public void importantMethod() {
        System.out.println("This method is important.");
    }
}

public class CustomAnnotationsDemo {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();
        obj.importantMethod();

        // Accessing custom annotation at runtime
        Method method = MyClass.class.getMethod("importantMethod");
        if (method.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
            System.out.println("Description: " + annotation.description());
        }
    }
}
