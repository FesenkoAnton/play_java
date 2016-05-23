package part2.lection13;
import java.net.*;
import java.io.*;

public class ObjectClient {
	public static void main(String[] args) throws IOException{
		InetAddress addr = InetAddress.getByName(null);
		System.out.println("адреса =" +addr);
		Socket socket = new Socket(addr, ObjectServer.PORT);
		try {
			TestStudent ts = new TestStudent("Вальт", 3);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(ts);
			oos.flush();
			oos.close();
		}finally{
			System.out.println("закриваємо клієнт");
			socket.close();
		}
	}
}
