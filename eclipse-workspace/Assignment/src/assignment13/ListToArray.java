package assignment13;

import java.util.*;

public class ListToArray {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        String[] array = list.toArray(new String[0]);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
