package part2.lection6;

import java.io.*;

class Student implements Serializable{
	private int course;
	private String name;
	
	Student(int a, String b){
		course =a;
		name = b;
	}
	@Override
	public String toString(){
		return name +" "+course;
	}
}

public class ObjectSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student mas[] = new Student[]{new Student(5,"Данло"), new Student(6,"Дмитро")};

		File fileTo = new File("masOfObjects.dat");
		FileOutputStream fout= new FileOutputStream(fileTo);
		ObjectOutputStream oos = new ObjectOutputStream (fout);
		oos.writeObject(mas);
		oos.close();
		
		File fileFrom = new File("masOfObjects.dat");
		FileInputStream fin = new FileInputStream(fileFrom);
		ObjectInputStream ois = new ObjectInputStream(fin);
		Student masO[] = (Student [])ois.readObject();
		for (Student i:masO)
			System.out.println(i);
		ois.close();
	}
	
}
