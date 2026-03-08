package assignment18;

class FinalDemo {

    final int x = 100;

    void display() {
        System.out.println("Final Variable value: " + x);
    }

    public static void main(String[] args) {

        FinalDemo obj = new FinalDemo();
        obj.display();

        // obj.x = 200;  // Error: cannot change final variable
    }
}
