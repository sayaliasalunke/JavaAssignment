package assigment15;

import java.util.HashMap;

public class MergeHashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Java");
        map1.put(2,"Python");

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(3,"C++");
        map2.put(4,"JavaScript");

        map1.putAll(map2);

        System.out.println(map1);
    }
}