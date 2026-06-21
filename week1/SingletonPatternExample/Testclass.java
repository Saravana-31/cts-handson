package week1.SingletonPatternExample;
public class Testclass{
    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();
        l1.log("this is a 1st log message");
        l2.log("this is a 2nd log message");

    if(l1 == l2){
        System.out.println("both l1 and l2 are same instance");
    }else{
        System.out.println("both l1 and l2 are different instance");
    }
    }
}