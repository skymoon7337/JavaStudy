package scanner;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {

        double sum=0;
        int number=0;
        double price=0;

        Scanner sc= new Scanner(System.in);

        while (true) {

            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option=sc.nextInt();
            sc.nextLine();

            if (option == 1) {

                double subsum=0;
                System.out.println("상품명을 입력하세요: ");
                String name = sc.nextLine();

                System.out.println("가격을 입력하세요: ");
                price= sc.nextInt();
                sc.nextLine();

                System.out.println("수량을 입력하세요: ");
                number= sc.nextInt();
                sc.nextLine();

                sum+=(price*number);
                subsum=(price*number);

                System.out.printf("상품명: %s, 가격: %.0f, 수량: %d, 합계: %.0f / 총 합계: %.0f",name,price,number,subsum,sum);
                System.out.println("");

            } else if (option == 2) {
                System.out.printf("총 비용: %.0f",sum);
                System.out.println("");
                sum=0;
                break;

            }  else if (option ==3){
                System.out.println("프로그램을 종료합니다.");
                break;

            }   else{
                System.out.println("올바른 옵션을 입력해 주세요.");
            }

        }

        sc.close();
    }
}
