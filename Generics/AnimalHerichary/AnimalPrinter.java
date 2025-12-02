package AnimalHerichary;

import java.util.*;

public class AnimalPrinter {

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.speak();
        }
    }

    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        printAnimals(dogs); // works
        printAnimals(cats); // works
    }
}

