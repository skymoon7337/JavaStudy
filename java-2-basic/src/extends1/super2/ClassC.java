package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
//        super(); (기본 생성자 사용시 생략 가능)
        super(10,20);
        System.out.println("classC 생성자");
    }
}
