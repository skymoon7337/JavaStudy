package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i =10;
        Object object = GenericMethod.objMethod(i);
       // Integer result = (Integer) GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(20);
        Double doubleValue = GenericMethod.<Double>numberMethod(30.5);

        // 타입 생략 가능 (추론)
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(20);
        Double doubleValue2 = GenericMethod.numberMethod(30.5);


    }
}
