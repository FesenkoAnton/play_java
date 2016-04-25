package part2.lection6;

import java.io.*;

public class FormatOutput {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream ("file.txt");
			PrintStream ps = new PrintStream(fos, true, "UTF-8");
			ps.println (" Форматований вивід :");
			double x = 4.23212321313, y= 5.6768868;
			ps.printf (" x =%5.3f , y =%5.3f %n ", x , y );
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
