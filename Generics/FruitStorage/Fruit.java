package FruitStorage;

class Fruit {
    public String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    public Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    public Mango() {
        super("Mango");
    }
}

