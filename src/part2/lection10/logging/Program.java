package part2.lection10.logging;

import java.io.IOException;

public class Program {

	private MyLogger ml;
	Program() throws IOException{
		ml = new MyLogger();
		ml.setClassName(this.getClass().getName());
	}
	
	public void doSmth(){
	    try {
	        throw new NullPointerException();
	    } catch(NullPointerException e) {
	        ml.logException(e);
	    }

	}

	public static void main(String[] args) throws IOException {
		
		Program p = new Program();
		p.doSmth();
	}

}
