package part2.lection6;

import java.io.*;

public class BuferExample {

	public static void main(String[] args) throws IOException {
		
		String fileName;
		if (args.length == 1) fileName = args[0];
		else fileName = "test.txt";
		
		try{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String s;
			do{
				s=br.readLine();
				if (s!=null){
					System.out.println(s);
				}
			}
			while (s!=null);
		}
			catch (FileNotFoundException e){
					System.out.println("Файл не знайдено");
			}
		}
	
}
