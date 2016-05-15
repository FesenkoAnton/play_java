package part2.lection10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception{
	
	private static Logger logger =
		    Logger.getLogger("LoggingException");
	
	public LoggingException() {
	    StringWriter trace = new StringWriter();
	    printStackTrace(new PrintWriter(trace));
	    logger.severe(trace.toString());
	  }
	
}

public class LoggingExceptions{
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream pw = new PrintStream(new FileOutputStream("err.txt",true));
		System.setErr(pw);
	    try {
	      throw new LoggingException();
	    } catch(LoggingException e) {
	      System.err.println("Caught " + e);
	    }
	    try {
	      throw new LoggingException();
	    } catch(LoggingException e) {
	      System.err.println("Caught " + e);
	    }
	  }
}