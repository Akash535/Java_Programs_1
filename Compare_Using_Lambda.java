package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



class Employee1 implements Comparable<Employee1>{
	String name,add;
	int id;
	double salary;
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public Employee1(String name, int id, double salary,String add ) {
		super();
		this.name = name;
		this.add = add;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id=" + id + ",\tname=" + name + ",\tmarks=" + salary + ",\tadd=" + add ;
	}
	@Override
	public int compareTo(Employee1 o) {
		return 0;
	}
	
}
public class Compare_Using_Lambda {

	public static void main(String[] args) {
List<Employee1> e1=new ArrayList<Employee1>();
		
		e1.add(new Employee1("Akash", 11, 54000, "Pune"));
		e1.add(new Employee1("Santosh", 41, 50000, "Baramati"));
		e1.add(new Employee1("Amar", 07 , 48200, "Satara"));
		e1.add(new Employee1("Harshal", 51, 43000, "Wagholi"));
		e1.add(new Employee1("Jayesh", 30, 60000, "Hadapsar"));
		e1.add(new Employee1("Mengesh", 21, 62000, "Viman nagar"));
		e1.add(new Employee1("mayur", 05, 48000, "Indapur"));
		
		System.out.println("Before Sorting");
		for(Employee1 e:e1)
			System.out.println(e);
		
		System.out.println("----------------Comparator Using Lambda Expreesion------------------------------------------------------------------------------------");
		Comparator<Employee1> Name=(Employee1 o1, Employee1 o2)-> o1.name.compareTo(o2.name);
		
		Comparator<Employee1> Id=(Employee1 o1,Employee1 o2)->o1.id-o2.id;
		
		Comparator<Employee1>Salary=(Employee1 o1,Employee1 o2)->{return (int) (-o1.salary+o2.salary);};
		
		Comparator<Employee1>Address=(Employee1 o1,Employee1 o2)-> o1.add.compareTo(o2.add);
		
		System.out.println("--------------------- After Sorting using Name -------------------------------------------------------------------------------");
		Collections.sort(e1,Name);
		System.out.println("\nBy Using Enhanced For Loop");
		for(Employee1 e:e1) {
			System.out.println(e);
		}
		
		System.out.println("--------------------- After Sorting using Id -------------------------------------------------------------------------------");
		Collections.sort(e1,Id);
		System.out.println("\nBy Using Iterator while Loop");
		Iterator<Employee1> it=e1.iterator();
		while(it.hasNext())
			System.out.println(it.next().getId());
		
		System.out.println("--------------------- After Sorting using Salary -------------------------------------------------------------------------------");
		Collections.sort(e1,Salary);
		System.out.println("\nBy Using ListIterator while Loop");
		ListIterator<Employee1> lit=e1.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next().getSalary());
		
		System.out.println("--------------------- After Sorting using Address -------------------------------------------------------------------------------");
		Collections.sort(e1,Address);
		System.out.println("\nBy Using Enumeration while Loop");
		Enumeration<Employee1> E=Collections.enumeration(e1);
		while(E.hasMoreElements())
			System.out.println(E.nextElement().getAdd());
	}

}

/*
OutPut :

Before Sorting
id=11,	name=Akash,	marks=54000.0,	add=Pune
id=41,	name=Santosh,	marks=50000.0,	add=Baramati
id=7,	name=Amar,	marks=48200.0,	add=Satara
id=51,	name=Harshal,	marks=43000.0,	add=Wagholi
id=30,	name=Jayesh,	marks=60000.0,	add=Hadapsar
id=21,	name=Mengesh,	marks=62000.0,	add=Viman nagar
id=5,	name=mayur,	marks=48000.0,	add=Indapur
----------------Comparator Using Lambda Expreesion------------------------------------------------------------------------------------
--------------------- After Sorting using Name -------------------------------------------------------------------------------

By Using Enhanced For Loop
id=11,	name=Akash,	marks=54000.0,	add=Pune
id=7,	name=Amar,	marks=48200.0,	add=Satara
id=51,	name=Harshal,	marks=43000.0,	add=Wagholi
id=30,	name=Jayesh,	marks=60000.0,	add=Hadapsar
id=21,	name=Mengesh,	marks=62000.0,	add=Viman nagar
id=41,	name=Santosh,	marks=50000.0,	add=Baramati
id=5,	name=mayur,	marks=48000.0,	add=Indapur
--------------------- After Sorting using Id -------------------------------------------------------------------------------

By Using Iterator while Loop
5
7
11
21
30
41
51
--------------------- After Sorting using Salary -------------------------------------------------------------------------------

By Using ListIterator while Loop
62000.0
60000.0
54000.0
50000.0
48200.0
48000.0
43000.0
--------------------- After Sorting using Address -------------------------------------------------------------------------------

By Using Enumeration while Loop
Baramati
Hadapsar
Indapur
Pune
Satara
Viman nagar
Wagholi


*/
