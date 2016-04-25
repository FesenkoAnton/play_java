package part2.lection6;

import java.io.*;

public class FormatReadFile {
	
	public static void main(String[] args) {
		StreamTokenizer st;
		
		try {
			st = new StreamTokenizer(new BufferedReader(new FileReader("file.txt")));
			while (st.nextToken()!=StreamTokenizer.TT_EOF) {
				switch (st.ttype) {
					case StreamTokenizer.TT_NUMBER : System.out.println(" Число : "+st.nval);
						break ;
					case StreamTokenizer.TT_WORD : System.out.println(" Слово : "+st.sval);
						break ;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
