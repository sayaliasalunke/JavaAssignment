package assignment13;

import java.util.*;

public class CompareArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Mango");
        list1.add("Banana");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Mango");
        list2.add("Banana");

        if (list1.equals(list2)) {
            System.out.println("Both ArrayLists are equal");
        } else {
            System.out.println("ArrayLists are not equal");
        }
    }
}
