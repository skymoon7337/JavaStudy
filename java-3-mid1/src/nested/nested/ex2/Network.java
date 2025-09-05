package nested.nested.ex2;

public class Network {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // 안에서만 쓰니까 합친거임 밖에서도 자주 쓰면 따로 클래스 만들어라
    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }
}
