package p1;

public class Student{
	int no;
	String name;
	int age;
	
	public Student(int no, String name, int age) {
		setNo(no);
		setName(name);
		setAge(age);
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no=no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String toString() {
		return "Student [no="+no+", name="+name+", age="+age+"]";
	
	}
}