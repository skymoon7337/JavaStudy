package scanner;

import java.util.Scanner;

public class ScannerWhileEx3_2 {
    public static void main(String[] args) {
        int input=0;
        int count=0;
        int sum=0;

        Scanner sc= new Scanner(System.in);

        while (true){
            System.out.print("숫자 입력: ");
            input = sc.nextInt();
            if(input!=-1){
                sum+=input;
                count++;
            }
            if(input==-1){
                break;
            }
        }

        double average= (double)sum/count;

        System.out.println("합은: " + sum);
        System.out.println("평균: " + average);


    }
}
