package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이",100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        // 와일드카드는 Animal 로 반환해서 수동 다운 캐스팅 필요(타입 반환 등의 한계가 있음)
        Dog dog2 = (Dog) WildcardEx.printAndReturnWildcard(dogBox);

        catBox.set(new Cat("냐옹이",200));
        Cat cat = WildcardEx.printAndReturnGeneric(catBox);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);


    }
}

