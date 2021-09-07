package Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int id;
	float marks;
	String name ,add;
	public Student(int id, String name,  float marks,String add) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public float getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	@Override
	public String toString() {
		return "id=" + id + ",\tname=" + name + ",\tmarks=" + marks + ",\tadd=" + add ;
	}
	public void compareTo() {
		
	}
	@Override
	public int compareTo(Student o) {
		//return this.id-o.id;
		
		//return this.name.compareTo(o.name);
		
		if(this.marks<o.marks)
			return 1;
		else if(this.marks>o.marks)
			return -1;
		else
			return 0;

		//return this.add.compareTo(o.add);
	}
	
}

public class Overriding_compareTo {

	public static void main(String[] args) {
		ArrayList <Student> s1=new ArrayList<Student>();
		s1.add(new Student(42,"Akash", 85.81f,  "Pune"));
		s1.add(new Student(21,"Omkar", 80.20f,  "Baramati"));
		s1.add(new Student(40,"Sachin", 75.91f,  "Indapur"));
		s1.add(new Student(11,"Akash", 82.24f,  "Kolhapur"));
		s1.add(new Student(4,"Amar", 65.45f,  "Dound"));
		s1.add(new Student(12,"Santosh", 95.81f,  "Akola"));
		s1.add(new Student(22,"Vijay", 88.29f,  "Baramati"));
		s1.add(new Student(2,"Mangesh", 65.41f,  "Wagholi"));
		s1.add(new Student(31,"Harshad", 55.1f,  "Pune"));

		System.out.println("Before Sorting :");
		for(Student s:s1) {
			System.out.println(s);
		}
		
		System.out.println("\nAfter Sorting by Marks:");
		//Collections.sort(s1);
		s1.sort(null);
		for(Student s:s1) {
			System.out.println(s);
		}
		
	}

}
