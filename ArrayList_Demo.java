package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Demo {
    public static void main(String[]argu){

        ArrayList l=new ArrayList();
        l.add('A');                                                          // $$ l.add('C');
        l.add('B');
        l.add('C');
        l.add('D');
        System.out.println("add l :"+l);

        ArrayList a=new ArrayList();
        a.add('X');
        a.add('Y');
        a.add('Z');
        System.out.println("add a :"+a);

        ArrayList b=new ArrayList();
        b.add('L');                                                          // $$ l.add('A');
        b.add('M');
        b.add('N');
        b.add('O');
        System.out.println("add b :"+b);

        System.out.println("use 'for each' loop to print arraylist:");
        for(Object i:b)                         // ###############     for each loop     #################### //
            System.out.println(i);


        l.addAll(1,a);                                                  // $$ l.addAll(a / index , a);
        //a.addAll(l);
        l.addAll(b);
        System.out.println("\naddAll array a in l :"+l);
        System.out.println("\nsize of array l :"+l.size()); 
        
        System.out.println("\ncontain G is present in array l :"+l.contains('G'));    // $$ l.contains('M');
        System.out.println("contain A is present in array l :"+l.contains('A'));
        System.out.println("contain O is present in array l :"+l.contains('O'));

        
        l.remove(2);                                                   // $$ l.remove(index);
        System.out.println("\nremove index 2 array l :"+l);

        l.removeAll(a);                                                     // $$ l.removeAll(a);
        System.out.println("\nremove array a into l :"+l);

        l.retainAll(b);                                                     // $$ l.retainAll(b);
        System.out.println("\nretainAll array b in l :"+l);

        System.out.println("\nsize of array l :"+l.size());                   // $$ l.size();

        
        l.clear();// l.removeAll(l);
        System.out.println("\nclear element in array l :"+l);                 // $$ l.clear();

        System.out.println("\narray l is empty :"+l.isEmpty());               // $$ l.isEmpty();
        System.out.println("array a is empty :"+a.isEmpty());

        a.iterator();
        System.out.println("\narray l is empty :"+a);                        // $$ a.iterator();
    }
}
