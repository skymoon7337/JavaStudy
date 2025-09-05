package extends1.super2;

public class ClassB extends ClassA{

//    public ClassB (){
//
//    }

    public ClassB(int a){
        //super(); // 필수(기본 생성자면 생략 가능)
        this(a,0);
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b){
        //super(); // 필수(기본 생성자면 생략 가능)
        System.out.println("ClassB 생성자 a="+a+"b="+b);
    }
}
