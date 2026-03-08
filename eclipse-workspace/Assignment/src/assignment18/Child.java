package assignment18;

class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child x: " + this.x);
        System.out.println("Parent x: " + super.x);

        this.show();
        super.show();
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
