package week1.FactoryMethodPatternExample;
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Going to open a Pdf document...");
    }
    
}