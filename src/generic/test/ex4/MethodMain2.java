package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이",100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.checkup(cat); //추론

        Dog dog2 = new Dog("큰 개", 200);
        Dog biggerdog = AnimalMethod.bigger(dog, dog2);
        //Dog biggerdog = AnimalMethod.bigger(dog, cat);
        System.out.println("biggerdog = " + biggerdog);
    }
}
