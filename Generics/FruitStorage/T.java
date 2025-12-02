package FruitStorage;

import java.util.ArrayList;

class FruitBox<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        for (T f : fruits) {
            System.out.println(f);
        }
    }
}

