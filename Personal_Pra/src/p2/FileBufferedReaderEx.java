package p2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileBufferedReaderEx {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("output2.txt"));
			
			String oneline;
			while((oneline = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(oneline,"-");
				int no = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				int age = Integer.parseInt(st.nextToken());
				
				Student s = new Student(no,name,age);
				System.out.println(s.toString());
			}
			br.close();
			System.out.println("학생 정보 로딩 완료!!!");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
