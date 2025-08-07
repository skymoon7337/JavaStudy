package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요. (종료는 0 입력)");

        while(true){
            int input = sc.nextInt();
            if(input == 0){
                break;
            }
            list.add(input);
        }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size()-1){
                System.out.print(", ");
            }
        }

    }
}
