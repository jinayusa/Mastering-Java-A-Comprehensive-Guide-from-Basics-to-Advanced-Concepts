//Dive into Object-Oriented Programming, including classes, objects, and constructors.
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class OOPBasics {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.displayDetails();
    }
}
