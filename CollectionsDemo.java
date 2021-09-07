package Collection_Framework;

import java.util.Vector;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String []argu){
        Vector v=new Vector();                          // $$$$$ Vector   $$$$$ //
        v.add(24);
        v.add(9);
        v.add(32);
        v.add(14);
        v.add(22);
        System.out.println("v :"+v);

        Collections.sort(v);                                                // $$ 1. Collections.sort(v);
        System.out.println("\nsort v :"+v);

        int x=Collections.binarySearch(v,24);                           // $$ 2. Collections.binarySearch(v,key);
        int y=Collections.binarySearch(v,26);
        System.out.println("\nBinarySearch key-14 :"+x+"\nBinarySearch key-26 :"+y);

        Collections.swap(v,3,0);                                             // $$ 3. Collections.reverse(v);
        System.out.println("\nswap v :"+v);
        
        Collections.sort(v);
        Collections.reverse(v);                                             // $$ 4. Collections.reverse(v);
        System.out.println("\nreverse v :"+v);

        Collections.shuffle(v);                                             // $$ 5. Collections.shuffle(v);
        System.out.println("\nshuffle v :"+v);
        Collections.shuffle(v);
        System.out.println("shuffle v :"+v);

        Vector v1=new Vector();                          // $$$$$ Vector   $$$$$ //
        v1.add(320);
        v1.add(54);
        v1.add(102);
        Collections.copy(v,v1);                                           // $$ 6. Collections.copy(v,v1);
        System.out.println("\ncopy v :"+v);

        Collections.min(v1);                                           // $$ 7. Collections.min(v1);
        Collections.min(v);
        System.out.println("\nmin v1 :"+v1);
        System.out.println("min v :"+v);

        Collections.max(v1);                                           // $$ 8. Collections.max(v1);
        Collections.max(v);
        System.out.println("\nmax v1 :"+v1);
        System.out.println("max v :"+v);

    }
}
 