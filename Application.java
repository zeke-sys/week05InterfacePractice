package week05FileLoggingApp;

public class Application {
	
	static Logger logger;

	public static void main(String[] args) {
		
		Logger logger = new ConsoleLogger(); //ConsoleLogger is the class created through the interface with Logger
		
		//we can switch out ConsoleLogger for another interface class to run the application
		logger.info("Hello");
		logger.warning("This is a warning!");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error!");
		
		logger.close();
		
	
			

	} //end of main
	
	
} //end of class
