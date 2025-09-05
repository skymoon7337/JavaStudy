package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요. (종료는 0 입력)");
        int input = sc.nextInt();
        sc.nextLine();
        while(input != 0){
            list.add(input);
            input = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size()-1){
                System.out.print(list.get(i)+", ");
            } else {
                System.out.print(list.get(i));
            }
        }

    }
}
