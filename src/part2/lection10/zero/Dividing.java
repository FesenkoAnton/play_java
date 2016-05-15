package part2.lection10.zero;

import java.util.Random;

public class Dividing {

	public static int divide(int i, int j){
		return i/j;
	}
	
	public static void main(String[] args) {
	
		Random rand = new Random();
		while(true){
			int i = rand.nextInt(10);
			int j = rand.nextInt(10);
			System.out.println("i- "+i+" j- "+j+" i/j"+divide(i,j));
		}

	}

}
