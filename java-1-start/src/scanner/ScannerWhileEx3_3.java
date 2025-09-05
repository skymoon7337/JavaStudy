package scanner;

import java.util.Scanner;

public class ScannerWhileEx3_3 {
    public static void main(String[] args) {
        int input=0;
        int count=0;
        int sum=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("숫자 입력: ");
        while ((input=sc.nextInt())!=-1){
                sum+=input;
                count++;
                System.out.println("숫자 입력: ");
        }

        double average= (double)sum/count;

        System.out.println("합은: " + sum);
        System.out.println("평균: " + average);


    }
}