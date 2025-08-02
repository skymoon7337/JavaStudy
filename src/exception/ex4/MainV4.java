package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args)  {
        //NetworkServiceV4 networkServiceV0 = new NetworkServiceV4();
        NetworkServiceV5 networkServiceV0 = new NetworkServiceV5();
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

            try{
                networkServiceV0.sendMessage(input);
            }catch (Exception e){
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }

    private static void exceptionHandler(Exception e){
        System.out.println("죄송합니다 알 수 없는 오류입니다.");
        System.out.println("- 개발자용 메시지 -");
        e.printStackTrace(System.out);      // 스택 트레이스 출력
//        e.printStackTrace(System.err);    // 우리 보기 쉽게 하기위해 out을 사용했을뿐임
//        e.printStackTrace();


        // 필요시 예외 별로 별도의 추가 처리 가능(new 로 생성된 객체가 넘어왔음)
        //instance of: e가 실제로 SendExceptionV4(또는 그 하위) 객체면,SendExceptionV4 타입 변수로 다운캐스팅(새로 생성x)
        if (e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류]  전송 데이터: " + sendEx.getSendData());
        }
    }
}
