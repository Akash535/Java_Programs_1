package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("Akash");
		ll.add("Sachin");
		ll.add("Sagar");
		ll.add("Omkar");
		ll.add("Mayur");
		ll.add("Santosh");
		
		System.out.println(ll);
		
		ll.remove("Mayur");
		System.out.println(ll);
		
		
		ll.add("i lives in pune");
		ll.add("laptop");
		System.out.println(ll);
		
		//iterator
		System.out.println("---------------ITERATOR---------------");
		
		Iterator<String>itr =ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------listiterator----------");
		ListIterator<String> litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("----------------list iterator previous-------------------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("--------------------enhance loop----------");
		for(String s:ll)
			System.out.println(s);
		//----------------------------------------------------------------
		System.out.println("------------------------------for each method-------------------");
		ll.forEach(p->System.out.println(p));

	
	}

}

/*
 OutPut-
 
 [Akash, Sachin, Sagar, Omkar, Mayur, Santosh]
[Akash, Sachin, Sagar, Omkar, Santosh]
[Akash, Sachin, Sagar, Omkar, Santosh, i lives in pune, laptop]
---------------ITERATOR---------------
Akash
Sachin
Sagar
Omkar
Santosh
i lives in pune
laptop
--------------------listiterator----------
Akash
Sachin
Sagar
Omkar
Santosh
i lives in pune
laptop
----------------list iterator previous-------------------
laptop
i lives in pune
Santosh
Omkar
Sagar
Sachin
Akash
--------------------enhance loop----------
Akash
Sachin
Sagar
Omkar
Santosh
i lives in pune
laptop
------------------------------for each method-------------------
Akash
Sachin
Sagar
Omkar
Santosh
i lives in pune
laptop

*/
