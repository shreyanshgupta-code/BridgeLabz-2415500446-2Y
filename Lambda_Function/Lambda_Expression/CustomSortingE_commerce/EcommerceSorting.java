package Lambda_Expression.CustomSortingE_commerce;

import java.util.*;

public class EcommerceSorting {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Shoes", 1500, 4.5, 20),
            new Product("Watch", 2500, 4.8, 10),
            new Product("Bag", 900, 4.1, 30),
            new Product("Jacket", 1800, 4.7, 15)
        );

        System.out.println("\n--- Sort by Price (Low → High) ---");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\n--- Sort by Rating (High → Low) ---");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\n--- Sort by Discount (High → Low) ---");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}

