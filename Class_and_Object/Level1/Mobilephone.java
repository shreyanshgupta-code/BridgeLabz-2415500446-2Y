public class Mobilephone {
    private String brand;
    private String model;
    private double price;

    public Mobilephone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
    public static void main(String[] args) {
        Mobilephone phone1 = new Mobilephone("Apple", "iPhone 15", 79999);
        Mobilephone phone2 = new Mobilephone("Samsung", "Galaxy S24", 69999);
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}

