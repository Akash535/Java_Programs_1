package Reflection_Programs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Student{
	private String name,add;
	int id,salary;
	public Student() {}
	public Student(String name,int id,int salary) {
		this.name=name;
		add="Pune";
		this.id=id;
		this.salary=salary;
	}
	public void method1() {
		System.out.println("Student [name=" + name + ",\t add=" + add + ",\t id=" + id + ",\t salary=" + salary + "]");
	}
	public void method2(String add) {
		System.out.println("Student [name=" + name + ",\t add=" + add + ",\t id=" + id + ",\t salary=" + salary + "]");
	}
	private void method3() {
		System.out.println("Student [name=" + name + ",\t add=" + add + ",\t id=" + id + ",\t salary=" + salary + "]");
	}
	private void method4(int salary) {
		System.out.println("Student [name=" + name + ",\t add=" + add + ",\t id=" + id + ",\t salary=" + salary + "]");
	}
}


public class ReflectionDemo3 {

	public static void main(String[] args) throws Exception {
		Student s=new Student();
		s=new Student("Akash", 01, 45001);
		s.method1();
		s.method2("Baramati");
		System.out.println("------------Ctor--------------");
		
		Class c=s.getClass();
		
		Constructor ctor=c.getConstructor();
		System.out.println(ctor.getName());
		System.out.println("------------Methods--------------");
		
		Method []m1=c.getMethods();
		for(Method a:m1)
			System.out.println(a.getName());
		System.out.println("-----------public method2 call by parameter---------------");
		
		Method m2=c.getDeclaredMethod("method2",String.class);
		m2.invoke(s, "Indapur");
		System.out.println("------------private method3 call--------------");
		
		Method m3=c.getDeclaredMethod("method3");
		m3.setAccessible(true);
		m3.invoke(s);
		System.out.println("------------private method4 call by parameter--------------");
		
		Method m4=c.getDeclaredMethod("method4",int.class);
		m4.setAccessible(true);
		m4.invoke(s, 50001);
	}

}
