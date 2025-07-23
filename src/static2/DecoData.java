package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
       // instanceValue++;
       // instanceMethod();
        staticValue++;
        staticMethod();
    }
    //객체생성이나 외부에서 객체 주입을 받으면 참조값이 생겨 가능함.
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();

    }

    private void instanceMethod(){
        System.out.println("instanceValue: "+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue: "+staticValue);
    }
}
