package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {

        if(logLevel == 3)
        {
            System.out.println(message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
