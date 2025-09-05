package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] splitText = text.split(" ");
        Map<String,Integer> save = new HashMap<>();

        for (String word : splitText) {
            Integer count = save.getOrDefault(word, 0)+1;
            save.put(word,count);
        }
        System.out.println(save);
    }



}

