package week1.Searching;

public class LinearSearch {
    public static Product LinearSearch(Product[] products, int productId) {
        for(int i=0;i<products.length;i++){
            if(products[i].productId==productId){
                return products[i];
            }
        }
        return null;
    }
}
