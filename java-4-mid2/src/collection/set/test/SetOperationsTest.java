package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 = " + union);

        Set<Integer> inter = new HashSet<>(set1);
        inter.retainAll(set2);
        System.out.println("교집합 = " + inter);

        Set<Integer> dif = new HashSet<>(set1);
        dif.removeAll(set2);
        System.out.println("차집합 = " + dif);
    }
}
