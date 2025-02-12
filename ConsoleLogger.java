package week05FileLoggingApp;

import java.util.Date;

public class ConsoleLogger implements Logger {

	@Override
	public void info(String info) {
		Date date = new Date();
		System.out.println(date.toString() + " - " + info);	
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		System.out.println(date.toString() + " - Warning - " + warning);
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		System.out.println(date.toString() + " - Error - " + error);
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		System.out.println(date.toString() + " - FATAL!!! - " + fatal.toUpperCase());
		
	}

	@Override
	public void close() {
		
	}

}
