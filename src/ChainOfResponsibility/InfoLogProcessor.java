package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == 1)
        {
            System.out.println(message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
