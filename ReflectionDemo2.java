package Reflection_Programs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Reflect{
	private String name,city;
	
	public Reflect() {
		name="Akash Shingade";
		city="Pune, Maharastra";
	}
	
	public void method1() {
		System.out.println("Student Name = "+name);
	}
	public void method2(int n) {
		System.out.println("Student Id = "+n);
	}
	private void method3() {
		System.out.println("Private Method3 \nStudent City = "+city);
	}
	private void method4(int pincode) {
		System.out.println("Private Method4\nCity Pincode = "+pincode);
	}
}
public class ReflectionDemo2 {

	public static void main(String[] args) throws Exception {
//		Class c1=Class.forName("Reflect");
//		Reflect r1=(Reflect)c1.newInstance();
//		System.out.println("Class Name = "+c1.getName());
		
		Reflect r2=new Reflect();
		Class c2=r2.getClass();
		System.out.println("Class Name = "+c2.getName());
		System.out.println("---------------Ctor-----------------");
		
		Constructor ctor=c2.getConstructor();
		System.out.println("Ctor Name = "+ctor.getName());
		System.out.println("----------------Methods----------------");
		
		System.out.println("Methods of Class Reflect :");
		Method[]m=c2.getMethods();
		for(Method a:m) {
			System.out.println("-->"+a);
			System.out.println(a.getName());
		}
		System.out.println("--------------------------------");

		Method m2=c2.getDeclaredMethod("method2", int.class);
		m2.invoke(r2, 121);
		System.out.println("--------------------------------");

		Field f=c2.getDeclaredField("name");
		f.setAccessible(true);
		f.set(r2, "Sachin Powar");
		Method m3=c2.getDeclaredMethod("method1");
		m3.invoke(r2);
		System.out.println("--------------------------------");

		Method m4=c2.getDeclaredMethod("method3");
		m4.setAccessible(true);
		m4.invoke(r2);
		System.out.println("--------------------------------");

		Method m5=c2.getDeclaredMethod("method4",int.class);
		m5.setAccessible(true);
		m5.invoke(r2, 411014);
		
	}

}
