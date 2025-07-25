package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.move();

        soundAnimal(cat);


    }
    private static void soundAnimal(AbstractAnimal abstractAnimal){
        System.out.println("동물 소리 테스트 시작");
        abstractAnimal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
