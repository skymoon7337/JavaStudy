package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = "+poly.value); // 변수는 오버라이딩 x
        poly.method(); // 메서드 오버라이딩

        Parent poly2 = new GrandSon();
        System.out.println("Parent -> GrandSon");
        System.out.println("value = "+poly2.value); // 변수는 오버라이딩 x
        poly2.method(); // 메서드 오버라이딩
    }
}
