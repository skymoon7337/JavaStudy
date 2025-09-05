package array.ex;

import java.util.Scanner;

public class ArrayEx7_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][3];
        String arr2[]={"국어 점수: ","영어 점수 : ","수학 점수 : "};

        int score;
        int sum;
        double avr;

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr2[j]);
                score = sc.nextInt();
                arr[i][j] = score;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                }
            avr=(double)sum/3;
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.2f\n", i+1, sum, avr);
            }

        }
}