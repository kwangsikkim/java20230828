package ch07extends.book.sec10.exam02;

import ch07extends.book.exercise.p12.C;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매개 변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());

    }
    public static void animalSound(Animal animal){

        animal.sound();
    }
}
