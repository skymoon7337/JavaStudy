package collection.set.test;

import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> setArr = new TreeSet<>(List.of(30,20,20,10,10));
        
        for (Integer i : setArr) {
            System.out.println(i);
        }
    }
}
