package part2.lection6;

import java.io.*;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File fileTo = new File("masObject.dat");
		FileOutputStream fout= new FileOutputStream(fileTo);
		ObjectOutputStream oos = new ObjectOutputStream (fout);
		int intmas[] = new int []{1,2,3,4,5};
		oos.writeObject(intmas);
		oos.close();
		
		File fileFrom = new File("masObject.dat");
		FileInputStream fin = new FileInputStream(fileFrom);
		ObjectInputStream ois = new ObjectInputStream(fin);
		int mas[] = (int [])ois.readObject();
		for (int i:mas)
			System.out.println(i);
		ois.close();
		
	}

}
