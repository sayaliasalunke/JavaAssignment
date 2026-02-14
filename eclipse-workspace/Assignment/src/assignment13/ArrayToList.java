package assignment13;

import java.util.*;

public class ArrayToList {
    public static void main(String[] args) {

        String[] array = {"Red", "Green", "Blue"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        for (String color : list) {
            System.out.println(color);
        }
    }
}
