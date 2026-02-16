package Assignment14;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    
	public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println("Iterating HashMap:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

