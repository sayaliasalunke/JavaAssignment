package assigment15;

import java.util.*;

public class SortByValue {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Banana");
        map.put(2,"Apple");
        map.put(3,"Mango");

        List<Map.Entry<Integer,String>> list =
                new ArrayList<>(map.entrySet());

        Collections.sort(list, (a,b) -> a.getValue().compareTo(b.getValue()));

        for(Map.Entry<Integer,String> entry : list)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
