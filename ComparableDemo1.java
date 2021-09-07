package Comparable;

public class ComparableDemo1 {

	public static void main(String[] args) {
		Integer i=100;
		
		System.out.println(i.compareTo(200));// -1
		
		System.out.println(i.compareTo(100));// 0
		
		System.out.println(i.compareTo(10));// 1
		
		
		
		Character c='a';
		System.out.println(c.compareTo('b'));// -1
		//System.out.println('B'.compareTo('b')); //Error
		c='B';
		System.out.println(c.compareTo('b'));// -32
		c='b';
		System.out.println(c.compareTo('B'));// 32
		
		System.out.println("Hello".compareTo("hello"));// -32
	}

}
