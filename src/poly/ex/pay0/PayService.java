package poly.ex.pay0;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        PayInterface pay = PaySelect.findPay(option);
        boolean result = pay.pay(amount);
        //이제 옵션을 PaySelect에 넣고 amount는 일단 그냥 여기서 하자

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}