package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 clientV0 = new NetworkClientV5(address)){
            clientV0.initError(data);
            clientV0.connect();
            clientV0.send(data);
        } catch (Exception e){
            System.out.println("예외 확인 : "+e.getMessage());
            throw e;
        }
    }
}
