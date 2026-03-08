package assignment17;

abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starts with key");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}
