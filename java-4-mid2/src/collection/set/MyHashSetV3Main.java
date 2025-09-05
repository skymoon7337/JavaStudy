package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {

        Myset<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // 검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" +searchValue+") = " + result);

        // String은 이미 자체적으로 contains,hashCode가 오버라이드 되어있음
        // 자체 생성 타입만 주의
        
    }
}
