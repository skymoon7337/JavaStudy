package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        //poly.childMethod();

        //다운 캐스팅
        Child child = (Child) poly;
        child.childMethod();;
    }
}
