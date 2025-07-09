package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하시오 :");
        k=sc.nextInt();

        int arr[][] = new int[k][3];
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
            avr=sum/3.0;
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.2f\n", i+1, sum, avr);
            }

        }
}