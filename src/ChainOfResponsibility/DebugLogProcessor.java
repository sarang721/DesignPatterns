package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == 2)
        {
            System.out.println(message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
