package collection.map.test;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("사과",500);
        map.put("바나나",500);
        map.put("망고",1000);
        map.put("딸기",1000);
        Collection<String> save = new ArrayList<>();

        for (String key : map.keySet()) {
            Integer value = map.get(key);
            if (value == 1000){
                save.add(key);
            }
        }
        System.out.println(save);
    }
}
