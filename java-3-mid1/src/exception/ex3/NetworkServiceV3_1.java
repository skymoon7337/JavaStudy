package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 clientV0 = new NetworkClientV3(address);

        clientV0.initError(data);


        try {
            clientV0.connect();
            clientV0.send(data);
        }

        catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+e.getAddress()+ ", 메시지: "+e.getMessage());
        }
        catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: "+e.getSendData()+ ", 메시지: "+e.getMessage());
        }
        finally {
            clientV0.disconnect();
        }

    }
}
