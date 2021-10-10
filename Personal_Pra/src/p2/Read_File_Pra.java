package p2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read_File_Pra {
	try {
		Reader reader = new FileReader("output2.txt");
		
		int data;
		while ((data = reader.read()) != -1) {
			System.out.print((char) data);
		}
		reader.close();
		
		System.out.println("\n 학생 정보 가져오기 완료!!!");
	} catch (FileNotFoundException q) {
		q.printStackTrace();
	} catch(IOException a) {
		a.printStackTrace();
	}
}
}
