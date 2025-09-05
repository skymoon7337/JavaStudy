package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a.getValue() + ", 주소 = " + System.identityHashCode(a));
        System.out.println("b = " + b.getValue() + ", 주소 = " + System.identityHashCode(b));

        b.setValue("부산");
        System.out.println("\n부산 -> b");
        System.out.println("a = " + a.getValue() + ", 주소 = " + System.identityHashCode(a));
        System.out.println("b = " + b.getValue() + ", 주소 = " + System.identityHashCode(b));

        Address c = new Address("인천");
        b = c;
        System.out.println("\n인천 -> c / b = c");
        System.out.println("a = " + a.getValue() + ", 주소 = " + System.identityHashCode(a));
        System.out.println("b = " + b.getValue() + ", 주소 = " + System.identityHashCode(b));
        System.out.println("c = " + c.getValue() + ", 주소 = " + System.identityHashCode(c));

        c = b;
        System.out.println("c = " + c.getValue() + ", 주소 = " + System.identityHashCode(c));


    }
}

