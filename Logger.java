package week05FileLoggingApp;

//creating app using an interface
public interface Logger {
	
	public void info(String info);
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	public void close();

} //end of interface
