package part2.lection10.logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class MyLogger {

	private String fileName ="errors.log";
	private String className = "MyLogger";
	private Logger logger =Logger.getLogger(className);
	private PrintStream pw;
	public MyLogger() throws IOException{
		pw = new PrintStream(new FileOutputStream(fileName,true));
		System.setErr(pw);
	}
	
	public void setFileName(String fileName){
		this.fileName=fileName;
	}
	
	public void setClassName(String className){
		this.className = className;
	}
	
	public void logException(Exception e){
	    StringWriter trace = new StringWriter();
	    e.printStackTrace(new PrintWriter(trace));
	    logger.severe(trace.toString());
	}
	
}
