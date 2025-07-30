package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        
        Integer integer1 = Integer.parseInt(str);
        System.out.println("integer1 = " + integer1);
        
        int intvalue1 = integer1;
        System.out.println("intvalue1 = " + intvalue1);

        int intvalue2 = (int) integer1;
        System.out.println("intvalue2 = " + intvalue2);
        
        Integer integer2 = (Integer) intvalue2;
        System.out.println("integer2 = " + integer2);
    }
}
