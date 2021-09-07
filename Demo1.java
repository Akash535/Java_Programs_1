package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student001 implements Comparable<Student001>{
	int roll,addyears;
	String name;
	float marks;
	public Student001(int roll, String name,int addyears, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.addyears=addyears;
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public float getAddyears() {
		return addyears;
	}
	public float getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "roll=" + roll + ", \tname=" + name + ", \taddyears=" + addyears+", \tmarks=" + marks;
	}
	@Override
	public int compareTo(Student001 o) {
		if(this.addyears<o.addyears)
			return -1;
		else if(this.addyears>o.addyears)
			return 1;
		else
			return 0;
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		List<Student001> s1=new ArrayList<Student001>();
		s1.add(new Student001(42,"Akash",2018, 85.81f));
		s1.add(new Student001(21,"Omkar",2017, 80.20f));
		s1.add(new Student001(40,"Sachin",2019, 75.91f));
		s1.add(new Student001(11,"Akash",2017, 82.24f));
		s1.add(new Student001(4,"Amar", 2016,65.45f));
		s1.add(new Student001(12,"Santosh",2020, 95.81f));
		s1.add(new Student001(22,"Vijay",2019, 88.29f));
		s1.add(new Student001(2,"Santosh",2021, 65.41f));
		s1.add(new Student001(31,"Harshad",2017, 55.1f));

		System.out.println("Before Sorting :");
		for(Student001 s:s1) {
			System.out.println(s);
		}
		Comparator<Student001> cm=new Comparator<Student001>() {

			@Override
			public int compare(Student001 o1, Student001 o2) {
				
				if(o1.addyears<o2.addyears)
					return -1;
				else if(o1.addyears>o2.addyears)
					return 1;
				else return 0;
			}
		};
		Collections.sort(s1,cm);
		System.out.println("After Sorting :");
		for(Student001 s:s1) 
			System.out.println(s);
		
		
	}


}

/* 
OutPut :

Before Sorting :
roll=42, 	name=Akash, 	addyears=2018, 	marks=85.81
roll=21, 	name=Omkar, 	addyears=2017, 	marks=80.2
roll=40, 	name=Sachin, 	addyears=2019, 	marks=75.91
roll=11, 	name=Akash, 	addyears=2017, 	marks=82.24
roll=4, 	name=Amar, 	addyears=2016, 	marks=65.45
roll=12, 	name=Santosh, 	addyears=2020, 	marks=95.81
roll=22, 	name=Vijay, 	addyears=2019, 	marks=88.29
roll=2, 	name=Santosh, 	addyears=2021, 	marks=65.41
roll=31, 	name=Harshad, 	addyears=2017, 	marks=55.1
After Sorting :
roll=4, 	name=Amar, 	addyears=2016, 	marks=65.45
roll=21, 	name=Omkar, 	addyears=2017, 	marks=80.2
roll=11, 	name=Akash, 	addyears=2017, 	marks=82.24
roll=31, 	name=Harshad, 	addyears=2017, 	marks=55.1
roll=42, 	name=Akash, 	addyears=2018, 	marks=85.81
roll=40, 	name=Sachin, 	addyears=2019, 	marks=75.91
roll=22, 	name=Vijay, 	addyears=2019, 	marks=88.29
roll=12, 	name=Santosh, 	addyears=2020, 	marks=95.81
roll=2, 	name=Santosh, 	addyears=2021, 	marks=65.41


*/
