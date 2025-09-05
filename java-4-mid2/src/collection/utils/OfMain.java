package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> list2 = Set.of(1, 2, 3);
        Map<Integer,String> list3 = Map.of(1,"one", 2,"two", 3,"three");

        System.out.println("List.of = " + list);
        System.out.println("Set.of = " + list2);
        System.out.println("Map.of = " + list3);

        System.out.println("List.of class = "+list.getClass());
        System.out.println("Set.of class = "+list2.getClass());
        System.out.println("Map.of class = "+list3.getClass());

        //list.add(1);
        //java.lang.UnsupportedOperationException 예외 발생


    }
}

