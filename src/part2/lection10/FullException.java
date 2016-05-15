package part2.lection10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class SuperProblem extends Exception{
	public SuperProblem(){}
	public SuperProblem(String msg){
		super(msg);
	}
}

public class FullException {

	public static void doOne() throws SuperProblem{
		System.out.println("Робимо ....");
		throw new SuperProblem();
	}
	
	public static void doSecond() throws SuperProblem{
		System.out.println("Робимо щось інше....");
		throw new SuperProblem("Помилка в doSecond");
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		PrintStream pw = new PrintStream(new FileOutputStream("log.txt",true));
        System.setOut(pw);
        
        try {
			doOne();
		} catch (SuperProblem e) {
			System.out.println(e);
		}
        
        try{
        	doSecond();
        }catch (SuperProblem e){
        	System.err.println(e);
        }
	}
}
