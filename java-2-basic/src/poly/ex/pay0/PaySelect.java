package poly.ex.pay0;

public class PaySelect {

    private PaySelect() {}

    public static PayInterface findPay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new NonPay();
        }
    }
}
