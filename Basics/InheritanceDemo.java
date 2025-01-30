//Understand inheritance in Java to reuse and extend classes.
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Car car = new Car();
        car.start(); // Polymorphism in action
    }
}
