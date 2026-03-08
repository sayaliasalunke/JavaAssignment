package assignment18;

class StaticDemo {

    static {
        System.out.println("Static Block 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    StaticDemo() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticDemo obj = new StaticDemo();
    }
}
