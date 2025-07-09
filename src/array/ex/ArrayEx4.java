package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int[] array=new int[5];
        int total=0;

        for (int i=0;i< array.length;i++) {
            System.out.println("숫자를 입력하세요.("+(5-i)+"번 남음)");
            array[i]= scanner.nextInt();
            total += array[i];
        }

        System.out.println("합계는: "+total);
        System.out.println("평균은: "+total/array.length);
    }
}

