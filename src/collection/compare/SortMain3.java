package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("d", 5);
        MyUser myUser4 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3, myUser4};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 정렬");
        Arrays.sort(array,new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 역정렬");
        Arrays.sort(array,new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
