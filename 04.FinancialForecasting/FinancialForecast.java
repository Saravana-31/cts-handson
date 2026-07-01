package week1.FinancialForecasting;

public class FinancialForecast {
    public static double forecast(double cv,double gr,int years){
        if(years==0){
            return cv;
            }
            return forecast(cv*(1+gr),gr,years-1);
    }
    public static void main(String[] args){
        double cv=10000;
        double gr=0.10;
        int years=3;
        double fv=forecast(cv,gr,years);
        System.out.println("Future Value: "+fv+" after "+years+" years");
    }
}
