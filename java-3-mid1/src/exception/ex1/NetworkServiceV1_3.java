package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV1 clientV0 = new NetworkClientV1(address);

        clientV0.initError(data);

        String connectResult = clientV0.connect();
        //ctrl alt shift t -> 7(Extract Method)로 리팩토링
        if (isSuccess(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: "+connectResult);
        } else{
            String sendResult = clientV0.send(data);
            if(isSuccess(sendResult)){
                System.out.println("[네트워크 오류 발생] 오류 코드: "+sendResult);
            }
        }

        clientV0.disconnect();
    }

    //리팩토링으로 추가
    private static boolean isSuccess(String connectResult) {
        return !connectResult.equals("success");
    }
}
