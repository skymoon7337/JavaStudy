package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println(" 단어 입력 단계 ");
        while(true){
            System.out.println("영어 단어 입력 (종료는 q) :");
            String engInput  =  sc.nextLine();
            if (engInput.equalsIgnoreCase("q")){
                break;
            }
            System.out.println("한글 뜻을 입력: ");
            String hanMeanInput = sc.nextLine();
            dictionary.put(engInput,hanMeanInput);
        }

        System.out.println(" 단어 검색 단계 ");
        while (true){
            System.out.println("찾을 영어 단어 입력 (종료는 q) :");
            String engSearch = sc.nextLine();
            if (engSearch.equalsIgnoreCase("q")){
                break;
            }
            String hanMean = dictionary.get(engSearch);
            if (hanMean==null){
                System.out.println(engSearch+"는 사전에 없는 단어 입니다.");
                continue;
            }
            System.out.println(engSearch+"의 뜻:"+hanMean);
        }
    }
}
