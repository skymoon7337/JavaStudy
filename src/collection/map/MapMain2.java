package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap= new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);
        // 같은 키에 중복 저장시 데이터 덮어쓰기
        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // 키로 삭제시 값도 지워짐
        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}
