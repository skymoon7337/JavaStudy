package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int[] array=new int[5];

        for (int i=0;i< array.length;i++) {
            System.out.println("숫자를 입력하세요.("+(array.length-i)+"번 남음)");
            array[array.length-(i+1)]= scanner.nextInt();
        }

        for (int i=0;i< array.length;i++) {
            System.out.print(array[i]);
            if (i< (array.length-1)){
                System.out.print(",");
            }
        }
    }
}
