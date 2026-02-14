package assignment13;

import java.util.*;

public class FrequencyArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("A");

        HashMap<String, Integer> map = new HashMap<>();

        for (String element : list) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        System.out.println("Frequency of elements:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

