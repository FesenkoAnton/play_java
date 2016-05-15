package part2.lection10.zero;

import java.util.Random;

public class DividingGood {

	public static int divide(int i, int j){
		if (j==0) throw new ArithmeticException("знаменик не може бути 0");
		return i/j;
	}
	
	public static void main(String[] args) {
	
		Random rand = new Random();
		//while(true){
		for (int n = 0; n<50; n++){
			int i = rand.nextInt(10);
			int j = rand.nextInt(10);
			try{
				System.out.println("i- "+i+" j- "+j+" i/j"+divide(i,j));
			}catch (ArithmeticException e){
				System.out.println(e.getMessage());
			}
		}

	}
	
}
