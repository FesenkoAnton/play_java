package part2.lection6;

import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println (" Введіть стрічку ");
		if (scanner.hasNextLine()) {
			String s=scanner.nextLine();
		}
		System. out .println(" Введіть число ");
		if (scanner.hasNextInt()) {
			int n =scanner.nextInt();
		}
		
		System . out . println ("Введіть дійсне число ");
		if (scanner.hasNextDouble()){
			double d=scanner.nextDouble();
		}
	}
}
