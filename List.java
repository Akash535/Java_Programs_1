package Collection_Framework;

import java.util.*;

public class List {
    public static void main(String []argu){
        ArrayList l1=new ArrayList(5);
        l1.add('A');
        l1.add('B');
        l1.add('C');
        l1.add('O');
        l1.add('K');
        l1.add('J');
        System.out.println("Original Array l1 :"+l1);

        l1.add(1,'X');                                                       // $$ l1.add(index,'X');
        System.out.println("\nadd index 1 Array l1 :"+l1);

        l1.set(0,'M');                                                                    // $$ l1.set(index,'M');
        System.out.println("\nset index 0 Array l1 :"+l1);

        System.out.println("\nget index 3 in array l1 :"+l1.get(3));                      // $$ l1.get(index);

        System.out.println("\nindex position of C in array l1 :"+l1.indexOf('C'));        // $$ l1.indexOf('C');
        System.out.println("index position of M in array l1 :"+l1.indexOf('M'));
        System.out.println("index position of D in array l1 :"+l1.indexOf('D'));

        System.out.println(l1);
        l1.remove(1);                                                               // $$ l1.remove(index);
        System.out.println("remove index 1 in array l1 :"+l1);

        System.out.println("subList of array l1 :"+l1.subList(1,4));                    // $$ l1.subList(start,end);
    }
}
 


/*import java.util.Iterator;
// ############################################   ArrayList   ##################################################
public class List {
    public static void main(String []argu){
        ArrayList l1=new ArrayList(4);
        System.out.println("size :"+l1.size());
        l1.add("Akash");
        l1.add("Satish");
        l1.add("Rahul");
        l1.add(1,"Ramesh");
        l1.add("Sachin");
        System.out.println(l1);
        System.out.println("\nUse in Iterator");
        Iterator it=l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("size :"+l1.size());
    }
}*/
 /*Output:
size :0
[Akash, Ramesh, Satish, Rahul, Sachin]

Use in Iterator
Akash
Ramesh
Satish
Rahul
Sachin
size :5*/




/*
import java.util.LinkedList;
// ##############################################     LinkedList     ############################################
public class List{
    public static void main(String []argu){
        LinkedList l1=new LinkedList();             // 1.constructor - LinkedList();
        l1.addFirst("Akash");
        l1.add(1,"Rahul");
        l1.addLast("Santosh");
        System.out.println(l1.getFirst());
        System.out.println(l1.get(1));
        System.out.println(l1.getLast());

        LinkedList l2=new LinkedList(l1);           // 2.constructor - LinkedList(Collection c);
        l2.addFirst("Sachin");
        l2.add("Omkar");
        l2.addLast("Pratik");
        System.out.println(l1);
        System.out.println(l2);

    }
}*/

/*Output:
Akash
Rahul
Santosh
[Akash, Rahul, Santosh]
[Sachin, Akash, Rahul, Santosh, Omkar, Pratik]
*/
 
/*
// #################################################    Vector    ###############################################
public class List{
    public static void main(String []argu){
        Vector v1=new Vector();
        v1.add('A');
        v1.add('B');
        v1.add('C');
        System.out.println(v1);
        System.out.println(v1.get(2));
        v1.set(1,'Z');
        System.out.println(v1);
        v1.add(2,'E');
        System.out.println(v1);
    }
}*/
/*Output:
[A, B, C]
C
[A, Z, C]
[A, Z, E, C]

 */

 
/*
// ##################################################     Stack      #############################################
public class List{
    public static void main(String []argu){
        Stack s1=new Stack();                           // 1.constructor  Stack();
        System.out.println("Stack is empty :"+s1.empty());  // $$ 1. s1.empty();
        s1.push('A');                                  // $$  2. s1.push();
        s1.push('B');
        s1.push('C');
        s1.push('D');
        s1.push('E');
        s1.push('F');
        s1.push('G');
        s1.push('H');
        System.out.println("Stack s1 :"+s1);
        System.out.println("1 pop :"+s1.pop());             // $$  3. s1.pop();
        System.out.println("Stack s1 :"+s1);
        System.out.println("2 pop :"+s1.pop());
        System.out.println("Stack s1 :"+s1);
        s1.push('X');
        s1.push('Y');
        System.out.println("2 push Stack is :"+s1);
        System.out.println("1 peek :"+s1.peek());           // $$  4. s1.peek();
        System.out.println("2 peek :"+s1.peek());
        System.out.println("Stack is :"+s1);
        System.out.println("position of X :"+s1.search('X'));  // $$  5. s1.search(Object o);
        System.out.println("position of B :"+s1.search('B'));
        System.out.println("position of H :"+s1.search('H'));
    }
}*/
/*Output:
 Stack is empty :true
Stack s1 :[A, B, C, D, E, F, G, H]
1 pop :H
Stack s1 :[A, B, C, D, E, F, G]
2 pop :G
Stack is :[A, B, C, D, E, F]
2 push Stack is :[A, B, C, D, E, F, X, Y]
1 peek :Y
2 peek :Y
Stack is :[A, B, C, D, E, F, X, Y]
position of X :2
position of B :7
position of H :-1

 */
 

