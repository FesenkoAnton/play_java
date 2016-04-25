package part2.lection6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class MyStreamTokenizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StreamTokenizer st;
		
		try {
			st = new StreamTokenizer(new BufferedReader(new FileReader("file.txt")));
			st.commentChar('$');//вказуємо символ, що є для нас коментарем і все інше до кінця стрічки пропускаємо
			st.slashSlashComments(true); //коментарі у вигляді подвійних слешів
			st.slashStarComments(true); //коментарі у вигляді слеш зірочка
			st.quoteChar('"'); //символ, що означає кавички, коли зустрічаємо слово в кавичках повертаємо без кавичек
			
			st.lowerCaseMode(true); //всі символи в нижній регістр
			st.ordinaryChar('.'); // java.io буде одним словом
			
			st.parseNumbers(); // режим в якому починають розпізнаватися цифри з плаваючою точкою...
			st.whitespaceChars(' ',' '); // діапазон символів, що є роздільниками
			st.whitespaceChars(']',']');
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
