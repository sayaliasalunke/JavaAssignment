package assigment15;

import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {

        String str = "java is easy and java is powerful";
        String words[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(String word : words)
        {
            if(map.containsKey(word))
            {
                map.put(word, map.get(word) + 1);
            }
            else
            {
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}
