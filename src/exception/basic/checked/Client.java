package exception.basic.checked;

public class Client {
    public void call() throws  MyCheckedException{ //밖은 나를 호출한곳 즉 .call을 호출한곳
        //문제 상황 발생 가정
        throw new MyCheckedException("ex");

    }
}
