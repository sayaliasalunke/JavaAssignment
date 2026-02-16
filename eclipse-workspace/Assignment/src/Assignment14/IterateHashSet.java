package Assignment14;

import java.util.HashSet;

public class IterateHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");

        System.out.println("Iterating HashSet using for-each:");

        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
