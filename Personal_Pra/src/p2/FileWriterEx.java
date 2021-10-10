package p2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("output2.txt");
			
			Student s = new Student(1,"홍길동",21);
			w.write(s.toString());
			w.close();
			
			System.out.println("학생 정보 저장!!!");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
