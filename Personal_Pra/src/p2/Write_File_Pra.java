package p2;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Write_File_Pra {

		public static void main(String args[]) {
			try {
			Writer w = new FileWriter("First_Pra.txt");
			List<Student> al=new ArrayList<Student>();
			
			
			
			Scanner sc = new Scanner(System.in);
			Student s1 = new Student(1,"jang",22);
			Student s2= new Student(2,"hada",17);
			al.add(s1);
			al.add(s2);
		
			for(int i=0;i<al.size();i++) {
				Student p= al.get(i);
				w.write(p.toString());
					
			}
			w.close();
			sc.close();
			
			} catch(FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
}
