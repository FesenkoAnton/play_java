package part2.lection13;
import java.io.*;
import java.net.*;

public class HttpURLTest {

	public static void main(String[] args) throws IOException {
		int c;
		URL hp = new URL("http://distedu.ukma.kiev.ua");
		BufferedReader in = new BufferedReader(new InputStreamReader(hp.openStream()));
		String str;
		while ((str=in.readLine())!= null){
			System.out.println(str);
		}
		in.close();
	}

}
