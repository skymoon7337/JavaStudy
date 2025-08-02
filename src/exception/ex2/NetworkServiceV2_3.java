package exception.ex2;

public class NetworkServiceV2_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);

        clientV0.initError(data);


        try {
            clientV0.connect();
            clientV0.send(data);
            clientV0.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류 코드] : "+e.getErrorCode()+", 메시지: "+e.getMessage());

        }

    }
}
