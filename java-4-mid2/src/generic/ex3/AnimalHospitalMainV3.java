package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        //<타입> 안쓰면 Raw 타입이라 Object로 처리
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
        //AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<Integer>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이", 300);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1 : 개 병원에 고양이 전달
        //dogHospital.set(cat);

        // 문제2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = "+biggerDog);


    }
}
