package Assignment20;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(1, "Sayali");

        // Serialization
        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();

        System.out.println("Object Serialized");

        // Deserialization
        FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println("ID: " + s2.id);
        System.out.println("Name: " + s2.name);
    }
}
