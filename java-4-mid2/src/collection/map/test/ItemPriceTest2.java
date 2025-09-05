package collection.map.test;

import java.util.*;

public class ItemPriceTest2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("사과",500);
        map.put("바나나",500);
        map.put("망고",1000);
        map.put("딸기",1000);
        List<String> save = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
           if(entry.getValue().equals(1000)){
                save.add(entry.getKey());
            }
        }
        System.out.println(save);
    }
}
