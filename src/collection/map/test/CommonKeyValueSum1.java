package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        map1.put("C",3);

        Map<String,Integer> map2 = Map.of("B",4,"C",5,"D",6);

        Map<String,Integer> mapSave = new HashMap<>();

        for (String m1 : map1.keySet()) {
            if (map2.containsKey(m1)){
                mapSave.put(m1,map1.get(m1)+map2.get(m1));
            }
        }
        System.out.println(mapSave);
    }
}
