package week1.Searching;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1, "Watch", "Electronics");
        products[1] = new Product(2, "Jersey", "Clothing");
        products[2] = new Product(3, "Tablet", "Electronics");
        products[3] = new Product(4, "Shoe", "Clothing");
        products[4] = new Product(5, "Cap", "Clothing");

        int searchId = 3;
        Product foundProductLinear = LinearSearch.LinearSearch(products, searchId);
        if (foundProductLinear != null) {
            System.out.println("Linear Search: Product found:");
            foundProductLinear.display();
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.productId, p2.productId));
        Product foundProductBinary = BinarySearch.BinarySearch(products, searchId);
        if (foundProductBinary != null) {
            System.out.println("Binary Search: Product found:");
            foundProductBinary.display();
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}
