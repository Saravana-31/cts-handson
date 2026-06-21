package week1.FactoryMethodPatternExample;
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Going to open a Word document...");
    }
    
}
