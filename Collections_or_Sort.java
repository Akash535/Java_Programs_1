package Comparable;

import java.util.ArrayList;
import java.util.Collections;


public class Collections_or_Sort {
	public static void main(String args[]) {
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(10);
		l1.add(-10);
		l1.add(100);
		l1.add(-1);
		l1.add(20);
		System.out.println("Before Sorting :");
		System.out.println(l1);
		for(Integer a:l1) {
			System.out.println(a);
		}
		
		//Collections.sort(l1);
		l1.sort(null);
		System.out.println("After Sorting :");
		System.out.println(l1);
		for(Integer a:l1) {
			System.out.println(a);
		}
		
		
	}
}
