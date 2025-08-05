package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> t) {
        BioUnit out = t.out();
        System.out.println("이름: " + out.getName() + ", HP: " + out.getHp());

    }
}
