package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] splitText = text.split(" ");
        Map<String,Integer> save = new HashMap<>();

        for (String s : splitText) {
            Integer count = save.get(s);
            if (save.get(s)==null){
                count = 0;
            }
            count ++;
            save.put(s,count);
        }
        System.out.println(save);


    }
}
