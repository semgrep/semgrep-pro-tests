package example;

public class App {
    public void log_contrived_exception(String s) {
        ExampleException e = new ExampleException(s);
        // ruleid: log-exception-example1-copy
        logger.log_exception(e);
    }
    
    public void log_contrived_exception2(String s) {
        BadRequest e = new BadRequest(s);
        // deep: log-exception-example1-copy
        logger.log_exception(e);
    }
    
    public void log_contrived_exception3(String s) {
        ArithmeticException e = new ArithmeticException(s);
        // deep: log-exception-example1-copy
        logger.log_exception(e);
    }
}