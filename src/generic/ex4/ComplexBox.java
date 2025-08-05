package generic.ex4;

import generic.animal.Animal;

public class ComplexBox <T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
        //animal.getName(); 가능
    }

    public <T> T printAndReturn(T t){
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: "+t.getClass().getName());
        //t.getname(); 불가능 소속이 다름
        return t;
    }
}
