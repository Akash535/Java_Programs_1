package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;





class Student implements Comparable<Student>{
	int id;
	String name,add;
	float marks;
	public Student(int id, String name, float marks, String add) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public double getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "id=" + id + ", \tname=" + name +  ", \tmarks=" + marks +", \tadd=" + add + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
	
}
class SortById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id-o2.id;
	}
}

class SortByName implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

class SortByMarks implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		if(o1.marks<o2.marks)
			return 1;
		else if(o1.marks>o2.marks)
			return -1;
		else 
			return 0;		
	}
}

class SortByAddress implements Comparator<Student>{
	public int compare(Student o1,Student o2) {
		return o1.add.compareTo(o2.add);
	}
}
public class Compare_OuterAnnonymous_Class {

	public static void main(String[] args) {
		List<Student> s1=new ArrayList<Student>();
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
		System.out.println("----------------------------------------------------------------------------------------------------");
		Collections.sort(s1, new SortById());
		System.out.println("\nAfter Sorting by Using Id:");
		System.out.println("Use Enhanced For Loop \n");
		for(Student s:s1) {
			System.out.println(s);
		}
		
		Collections.sort(s1,new SortByName());
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("\nAfter Sorting by using Name:");
		System.out.println("Use Iterator while Loop\n");
		Iterator<Student> it=s1.iterator();
		while(it.hasNext())
			System.out.println(it.next().getName());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		Collections.sort(s1,new SortByMarks());
		System.out.println("\nAfter Sorting by using Marks:");
		System.out.println("Use ListIterator while Loop\n");
		ListIterator<Student> lit=s1.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next().getMarks());
		
//		while(lit.hasPrevious())
//			System.out.println(lit.previous().getMarks());
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("\nAfter Sorting by using Address:");
		System.out.println("Use Enumeration while Loop\n");
		Enumeration<Student>e=Collections.enumeration(s1);
		while(e.hasMoreElements())
			System.out.println(e.nextElement().getAdd());
		
	}
}



/*
OutPut:

Before Sorting :
id=42, 	name=Akash, 	marks=85.81, 	add=Pune]
id=21, 	name=Omkar, 	marks=80.2, 	add=Baramati]
id=40, 	name=Sachin, 	marks=75.91, 	add=Indapur]
id=11, 	name=Akash, 	marks=82.24, 	add=Kolhapur]
id=4, 	name=Amar, 	marks=65.45, 	add=Dound]
id=12, 	name=Santosh, 	marks=95.81, 	add=Akola]
id=22, 	name=Vijay, 	marks=88.29, 	add=Baramati]
id=2, 	name=Mangesh, 	marks=65.41, 	add=Wagholi]
id=31, 	name=Harshad, 	marks=55.1, 	add=Pune]
----------------------------------------------------------------------------------------------------

After Sorting by Using Id:
Use Enhanced For Loop 

id=2, 	name=Mangesh, 	marks=65.41, 	add=Wagholi]
id=4, 	name=Amar, 	marks=65.45, 	add=Dound]
id=11, 	name=Akash, 	marks=82.24, 	add=Kolhapur]
id=12, 	name=Santosh, 	marks=95.81, 	add=Akola]
id=21, 	name=Omkar, 	marks=80.2, 	add=Baramati]
id=22, 	name=Vijay, 	marks=88.29, 	add=Baramati]
id=31, 	name=Harshad, 	marks=55.1, 	add=Pune]
id=40, 	name=Sachin, 	marks=75.91, 	add=Indapur]
id=42, 	name=Akash, 	marks=85.81, 	add=Pune]
----------------------------------------------------------------------------------------------------

After Sorting by using Name:
Use Iterator while Loop

Akash
Akash
Amar
Harshad
Mangesh
Omkar
Sachin
Santosh
Vijay
----------------------------------------------------------------------------------------------------

After Sorting by using Marks:
Use ListIterator while Loop

95.80999755859375
88.29000091552734
85.80999755859375
82.23999786376953
80.19999694824219
75.91000366210938
65.44999694824219
65.41000366210938
55.099998474121094
----------------------------------------------------------------------------------------------------

After Sorting by using Address:
Use Enumeration while Loop

Akola
Baramati
Pune
Kolhapur
Baramati
Indapur
Dound
Wagholi
Pune


*/