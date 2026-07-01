package week1.SingletonPatternExample;
class Logger{
    private static Logger inst;
    private Logger(){
        System.out.println("logger instance created....");
    }
    public static Logger getInstance(){
        if(inst == null){
            inst = new Logger();
        }
        return inst;
    }
    public void log(String message){
        System.out.println("log message that is to be displayed : " + message);
    }
}