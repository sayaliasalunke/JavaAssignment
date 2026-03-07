package assigment15;

import java.util.HashMap;
import java.util.TreeMap;

public class SortByKey {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(3,"Java");
        map.put(1,"Python");
        map.put(2,"C++");

        TreeMap<Integer,String> sortedMap = new TreeMap<>(map);

        System.out.println(sortedMap);
    }
}
