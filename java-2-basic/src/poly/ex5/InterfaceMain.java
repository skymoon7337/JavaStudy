package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

        moveAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal abAnimal){
        System.out.println("동물 소리 테스트 시작");
        abAnimal.sound();
        System.out.println("동물 소리 테스트 종료");

    }private static void moveAnimal(InterfaceAnimal abAnimal){
        System.out.println("동물 이동 테스트 시작");
        abAnimal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
