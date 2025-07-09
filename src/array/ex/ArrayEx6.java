package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇개를 입력할래?");
        int input = scanner.nextInt();
        int[] array = new int[input];

        for (int i = 0; i < array.length; i++) {
            System.out.println("숫자를 입력하세요.(" + (array.length - i) + "번 남음)");
            array[i] = scanner.nextInt();
        }


        int high = array[0];
        int low = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > high) high = array[i];
            if (array[i] < low)  low = array[i];
        }

        System.out.println("최대는: " + high);
        System.out.println("최소는: " + low);
    }
}
