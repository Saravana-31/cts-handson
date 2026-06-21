package week1.Searching;

public class BinarySearch {
    public static Product BinarySearch(Product[] products,int productId){
        int l=0;
        int r=products.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(products[m].productId==productId){
                return products[m];
            }else if(products[m].productId<productId){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return null;
    }
}
