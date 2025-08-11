package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(100);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        System.out.println("max = " + max);
        Integer min = Collections.min(list);
        System.out.println("min = " + min);

        System.out.println("list = "+list);
        Collections.shuffle(list);
        System.out.println("shuffle = "+list);

        Collections.reverse(list);
        System.out.println("reverse = "+list);

    }
}
