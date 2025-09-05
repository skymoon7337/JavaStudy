package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> doghospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> cathospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> Integerhospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> Objecthospital = new AnimalHospitalV2<>();
    }
}
