package oops_training;

interface Logger{
	void log(String message);
}
interface LevelLogger extends Logger{
	void logInfo(String message);
	void logWarning(String message);
	void logError(String message);
}
interface FormattedLogger extends LevelLogger{
	String format(String message, String level);
}
class ConsoleLogger implements FormattedLogger{

	@Override
	public void logInfo(String message) {
		// TODO Auto-generated method stub
		System.out.println(format(message, "INFO "));
	}

	@Override
	public void logWarning(String message) {
		// TODO Auto-generated method stub
		System.out.println(format(message, "WARNING "));
	}

	@Override
	public void logError(String message) {
		// TODO Auto-generated method stub
		System.out.println(format(message, "ERROR "));
	}

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(message + " [DEFAULT]");
	}

	@Override
	public String format(String message, String level) {
		// TODO Auto-generated method stub
		return "Message [" +message + "] Level "+ level+java.time.LocalDateTime.now();
	}
	
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormattedLogger log = new ConsoleLogger();
		log.log("Basic Log");
		log.logInfo("Application started");
		log.logWarning("Battery low");
		log.logError("NullPointerException");
	}

}
