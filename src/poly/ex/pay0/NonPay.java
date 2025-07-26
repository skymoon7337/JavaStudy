package poly.ex.pay0;

public class NonPay implements PayInterface{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
