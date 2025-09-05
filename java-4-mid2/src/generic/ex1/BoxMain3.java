package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에서 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자");
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        //stringBox.set(10);
        String string = stringBox.get();
        System.out.println("string = " + string);


        // 타입 추론 (이렇게 쓰는게 맞음)
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
