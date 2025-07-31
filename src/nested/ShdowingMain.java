package nested;

public class ShdowingMain {

    public int value=1;

    class Inner{
        public int value=2;

        void go(){
            int value=3;

            System.out.println("value = " + value);

            //this는 현재 객체(Inner 인스턴스)를 가리킴
            System.out.println("this.value = " +this.value);
            System.out.println("ShdowingMain.value = "+ShdowingMain.this.value);


        }
    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
