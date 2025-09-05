package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("몇개를 입력할래?");
        int input= scanner.nextInt();
        int[] array=new int[input];
        int total=0;

        for (int i=0;i< array.length;i++) {
            System.out.println("숫자를 입력하세요.("+(array.length-i)+"번 남음)");
            array[i]= scanner.nextInt();
            total += array[i];
        }

        System.out.println("합계는: "+total);
        System.out.println("평균은: "+total/array.length);
    }
}

