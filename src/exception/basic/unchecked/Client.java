package exception.basic.unchecked;

public class Client {
    public void call(){ //throws 생략 가능
        throw new MyUncheckedException("ex");
    }
}
