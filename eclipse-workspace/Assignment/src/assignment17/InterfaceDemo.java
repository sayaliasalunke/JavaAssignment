package assignment17;

interface Animal1 {
    void sound();
}

class Cat implements Animal1 {

    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
