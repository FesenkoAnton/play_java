package part2.lection6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	void copyFiles(String fileFrom, String fileTo) throws IOException{
		
		FileInputStream fin = new FileInputStream(fileFrom);
		FileOutputStream fout= new FileOutputStream(fileTo);
		byte bufer[] = new byte [4096];
		int count;
		do {
			count= fin.read(bufer);
			if (count>0) fout.write(bufer,0,count);
			}
		while (count>0);
		fin.close();
		fout.close();
	}

	public static void main(String[] args) {
		String from, to;

		if (args.length!=2){
			from = new String("test.txt");
			to = new String("testCopy.txt");
		}else{
			from = args[0];
			to = args[1];
		}
		CopyFile c = new CopyFile();
		try{
			c.copyFiles(from,to);
		}catch (IOException e){
			System.out.println(e);
		}
	}

}
