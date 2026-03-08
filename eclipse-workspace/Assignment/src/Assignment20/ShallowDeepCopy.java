package Assignment20;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int id;
    Address address;

    Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow Copy
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) throws Exception {

        Address a1 = new Address("Pune");
        Student s1 = new Student(1, a1);

        Student s2 = (Student) s1.clone(); // Shallow copy

        s2.address.city = "Mumbai";

        System.out.println("Original city: " + s1.address.city);
        System.out.println("Copied city: " + s2.address.city);
    }
}
