package week1.Searching;

public class Product {
    int productId;
    String productName;
    String Category;
    public Product(int productId, String productName, String Category) {
        this.productId = productId;
        this.productName = productName;
        this.Category = Category;
    }
    public void display(){
        System.out.println("Product id: " + productId);
        System.out.println("Product name: " + productName);
        System.out.println("Category: " + Category);
    }
}
