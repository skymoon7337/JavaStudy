package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        int input=0;
        int count=0;
        int sum=0;

        Scanner sc= new Scanner(System.in);

        while(input!=-1){
            System.out.print("숫자 입력: ");
            input = sc.nextInt();
            sum+=input;
            count++;
        }

        sum=sum+1;
        count=count-1;
        double count2=count;

        System.out.printf("합은: %d\n",sum);
        System.out.printf("평균은 : %f\n",(sum/count2));
    }
}
