package FruitStorage;

public class TestFruitBox {
    public static void main(String[] args) {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.addFruit(new Apple());

        FruitBox<Fruit> mixBox = new FruitBox<>();
        mixBox.addFruit(new Apple());
        mixBox.addFruit(new Mango());

        System.out.println("Apple Box:");
        appleBox.displayFruits();

        System.out.println("\nMixed Fruit Box:");
        mixBox.displayFruits();
    }
}

