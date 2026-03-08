package assignment18;

class Demo {
    Demo() {
        this(10);
        System.out.println("Default Constructor");
    }

    Demo(int a) {
        this(10, 20);
        System.out.println("One Parameter Constructor: " + a);
    }

    Demo(int a, int b) {
        System.out.println("Two Parameter Constructor: " + a + " " + b);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}