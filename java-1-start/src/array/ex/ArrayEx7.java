package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[4][3];

        int score;
        int sum;
        double avr;

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");

            for (int j = 0; j < arr[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("국어 점수 : ");
                        break;
                    case 1:
                        System.out.print("영어 점수 : ");
                        break;
                    case 2:
                        System.out.print("수학 점수 : ");
                        break;
                }
                score = sc.nextInt();
                arr[i][j] = score;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                }
            avr=(double) sum/3;
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.2f\n", i+1, sum, avr);
            }

        }
}