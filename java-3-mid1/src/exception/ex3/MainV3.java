package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)  {
        //NetworkServiceV3_1 networkServiceV0 = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkServiceV0 = new NetworkServiceV3_2();
        //NetworkServiceV2_3 networkServiceV0 = new NetworkServiceV2_3();
        //NetworkServiceV2_4 networkServiceV0 = new NetworkServiceV2_4();
        //NetworkServiceV2_5 networkServiceV0 = new NetworkServiceV2_5();


        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            networkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
