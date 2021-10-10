package p2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class P3_compareTo {


	public static void main(String args[]) {
	
		
		//origin//
		List<Student> al=new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Add num, name , age");
		for(int i=0;i<10;i++) {
			System.out.println("num:");
			int num = sc.nextInt();
			sc.nextLine();
			
			System.out.println("name:");
			String name = sc.nextLine();
			
			System.out.println("age:");
			int age = sc.nextInt();
			sc.nextLine();
			
			Student si = new Student(num,name,age);
			al.add(si);
			System.out.println(si.toString());
		}
		
		/*
		Student s1 = new Student(101,"Kim",23);
		al.add(s1);
		Student s2=new Student(102,"Lee",21);
		al.add(s2);
		al.add(new Student(103,"park",25));
		
		Collections.sort(al);
		*/
		
		for (Student s : al) {
			System.out.println(s.toString());
		}
		/*
		Collections.sort(al,Collections.reverseOrder());
		
		for (int i=0; i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
		*/
		
		sc.close();
		}
	}
