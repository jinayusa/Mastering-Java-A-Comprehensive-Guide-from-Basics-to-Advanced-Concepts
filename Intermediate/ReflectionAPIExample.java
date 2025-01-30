//Use the Reflection API to inspect and manipulate class definitions at runtime.
import java.lang.reflect.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ReflectionAPIExample {
    public static void main(String[] args) throws Exception {
        // Using Reflection to inspect the Person class
        Class<?> personClass = Person.class;

        // Create an instance using reflection
        Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
        Object personObj = constructor.newInstance("NDS", 25);

        // Invoke a method using reflection
        Method method = personClass.getMethod("displayInfo");
        method.invoke(personObj);
    }
}
