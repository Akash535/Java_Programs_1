package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Employee implements Comparable<Employee>{
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
	public Employee(String name, int id, double salary,String add ) {
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
	public int compareTo(Employee o) {
		
		//return this.id-o.id;
		
		//return this.name.compareTo(o.name);
		
		if(this.salary<o.salary)
			return 1;
		else if(this.salary>o.salary)
			return -1;
		else
			return 0;
		//return this.add.compareTo(o.add);
	}
	
}

public class Overriding_compareTo_use_Iterator {

	public static void main(String[] args) {
		List<Employee> e1=new ArrayList<Employee>();
		
		e1.add(new Employee("Akash", 11, 54000, "Pune"));
		e1.add(new Employee("Santosh", 41, 50000, "Baramati"));
		e1.add(new Employee("Amar", 07 , 48200, "Satara"));
		e1.add(new Employee("Harshal", 51, 43000, "Wagholi"));
		e1.add(new Employee("Jayesh", 30, 60000, "Hadapsar"));
		e1.add(new Employee("Mengesh", 21, 62000, "Viman nagar"));
		e1.add(new Employee("mayur", 05, 48000, "Indapur"));
		
		System.out.println("Before Sorting");
		for(Employee e:e1)
			System.out.println(e);
		
		Collections.sort(e1);
		Iterator<Employee> i=e1.iterator();
		System.out.println("\nAfter Sorting by Salary");
		while(i.hasNext())
			System.out.println(i.next().getSalary());
	}

}
