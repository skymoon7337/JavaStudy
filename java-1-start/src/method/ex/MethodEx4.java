package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int result=0;
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");

            int choice=scanner.nextInt();
            int Money;

            switch (choice){
                case 1:
                    System.out.println("입금액을 입력해주세요: ");
                    Money=scanner.nextInt();
                    result=input(result,Money);
                    break;
                case 2:
                    System.out.println("출금액을 입력해주세요: ");
                    Money=scanner.nextInt();
                    result=output(result,Money);
                    break;
                case 3:
                    System.out.println("잔액은 "+result+"원 입니다.");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
            }

        }
    }

    public static int input(int result, int Money){
        result+=Money;
        System.out.println(Money + "원을 입금하였습니다. 현재 잔액: " + result + "원");
        return result;
    }

    public static int output(int result, int Money){
        if (result>=Money){
            result-=Money;
            System.out.println(Money+ "원을 출금하였습니다. 현재 잔액: " + result + "원");
            return result;
        } else {
            System.out.println("잔액이 부족합니다.");

        }
        return result;
    }


}
