package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain4 {

    public static void hello(Ex1Algorithm Algorithm){
        System.out.println("시작");
        Algorithm.start();
        System.out.println("종료");
    }

    public static void main(String[] args) {

        hello(new Ex1Algorithm() {
            @Override
            public void start() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });
        
        hello(new Ex1Algorithm() {
            @Override
            public void start() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + (i + 1));
                }
            }
        });
    }
}

