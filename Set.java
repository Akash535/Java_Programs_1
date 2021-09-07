package Collection_Framework;

import java.util.*;
//  ##########################################      HashSet      ##############################################
/*public class Set {
    public static void main(String []argu){
        HashSet h1=new HashSet();                                     // $$ 1. constructor  HashSet();
        h1.add("one");
        h1.add("two");
        h1.add("three");
        h1.add("four");
        h1.add(null);
        h1.add("one");
        System.out.println("h1 :"+h1);

        HashSet h2=new HashSet(12);                        // $$ 2. constructor  HashSet(capacity);
        h2.add("Scahin");
        h2.add("Akash");
        h2.add("Omkar");
        h2.add("Rahul");
        h2.add("Ajay");
        System.out.println("\nh2 :"+h2);

        HashSet h3=new HashSet(12,50);            // $$ 3. constructor  HashSet(capacity ,loadFactor);
        System.out.println("h3 :"+h3);

        ArrayList a=new ArrayList();                                // $$ ArrayList
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("four");
        a.add("one");
        System.out.println("a :"+a);
        HashSet h4=new HashSet(a);                                 // $$ 4. constructor  HashSet(Collection c);
        System.out.println("h4 :"+h4);
    }
}
 */


//  ##########################################      LinkedHashSet      ##############################################
/*public class Set {
    public static void main(String []argu){
        LinkedHashSet h1=new LinkedHashSet();                                // $$ 1. constructor  LinkedHashSet();
        h1.add("one");
        h1.add("three");
        h1.add("two");
        h1.add("four");
        h1.add(null);
        h1.add("one");
        System.out.println("h1 :"+h1);

        LinkedHashSet h2=new LinkedHashSet(12);                // $$ 2. constructor  LinkedHashSet(capacity);
        h2.add("Scahin");
        h2.add("Akash");
        h2.add("Omkar");
        h2.add("Rahul");
        h2.add("Ajay");
        System.out.println("\nh2 :"+h2);

        LinkedHashSet h3=new LinkedHashSet(12,50);    // $$ 3. constructor  LinkedHashSet(capacity ,loadFactor);
        System.out.println("\nh3 :"+h3);

        ArrayList a=new ArrayList();                                      // $$ ArrayList
        a.add("one");
        a.add("four");
        a.add("one");
        a.add("two");
        a.add("three");
        System.out.println("\na :"+a);
        LinkedHashSet h4=new LinkedHashSet(a);                                 // $$ 4. constructor  LinkedHashSet(Collection c);
        System.out.println("\nh4 :"+h4);
    }
}
 */



//  ##########################################      SortedSet      ##############################################
/*public class Set {
    public static void main(String []argu){
        TreeSet t1= new TreeSet();                      // $$$$$$$$$$$     TreeSet      $$$$$$$$$$$ //
        t1.add("F");
        t1.add("D");
        t1.add("E");
        t1.add("B");
        t1.add("C");
        System.out.println("t1 :"+t1);
        System.out.println("\nfirst element :"+t1.first());                             // $$ 1. t1.first();
        System.out.println("\nlast element :"+t1.last());                               // $$ 2. t1.last();
        System.out.println("\nheadset of t1 from C :"+t1.headSet("C"));         // $$ 3. t1.headSet();
        System.out.println("\ntailSet of t1 from C :"+t1.tailSet("C"));       // $$ 4. t1.tailSet();
        System.out.println("\nsubSet of t1 from A to D:"+t1.subSet("A","D"));           // $$ 5. t1.subSet();
        System.out.println("\ncomparator :"+t1.comparator());                           // $$ 6. t1.comparator();
   }
}
 */



//  ##########################################      NevigationSet      ##############################################
/*public class Set {
    public static void main(String[] argu) {
        TreeSet t1 = new TreeSet();                     // $$$$$$$$$$$     TreeSet      $$$$$$$$$$$ //
        t1.add("F");
        t1.add("D");
        t1.add("G");
        t1.add("B");
        t1.add("J");
        t1.add("W");
        t1.add("I");
        t1.add("M");

        System.out.println("\nt1 :" + t1);

        System.out.println("\nceiling D :"+t1.ceiling("D"));                         // $$ 1. t1.ceiling();
        System.out.println("ceiling A :"+t1.ceiling("A"));

        System.out.println("\nfloor I :"+t1.floor("I"));                             // $$ 2. t1.floor();
        System.out.println("floor H :"+t1.floor("H"));

        System.out.println("\nhigher I :"+t1.higher("I"));                             // $$ 3. t1.higher();
        System.out.println("higher A :"+t1.higher("A"));
        System.out.println("higher W :"+t1.higher("W"));

        System.out.println("\nlower I :"+t1.lower("I"));                             // $$ 4. t1.lower();
        System.out.println("lower H :"+t1.lower("H"));
        System.out.println("lower A :"+t1.lower("A"));

        System.out.println("\npollFirst :"+t1.pollFirst());                             // $$ 5. t1.pollFirst();
        System.out.println("t1 :" + t1);

        System.out.println("\npollLast :"+t1.pollLast());                             // $$ 6. t1.pollLast();
        System.out.println("t1 :" + t1);
    }
}
 */



//  ##########################################      TreeSet      ##############################################
/*public class Set {
    public static void main(String[] argu) {
        TreeSet t1 = new TreeSet();                      // $$$$$$$$$$$     TreeSet      $$$$$$$$$$$ //
        t1.add("F");
        t1.add("D");
        // t1.add(10);         // Exception in thread "main" java.lang.ClassCastException
        t1.add("E");
        t1.add("B");
        t1.add("C");
        // t1.add(null);     // Exception in thread "main" java.lang.NullPointerException
        System.out.println("t1 :" + t1);

        String a="Akash",b="akash";
        System.out.println(a.compareTo(b));


            //TreeSet t2 = new TreeSet();                     // $$$$$$$$$$$     TreeSet      $$$$$$$$$$$ //
            // t1.add(new StringBuffer("F"));
            // t1.add(new StringBuffer("D"));
            // t1.add(new StringBuffer("G"));
            // t1.add(new StringBuffer("B"));
            // System.out.println("t2 :" + t2);  // Exception in thread "main" java.lang.ClassCastException
    }
}
 */



//  ##########################################      TreeSet      ##############################################

/*
class Book{
        private  String title;
        private double price;
        public Book(String title,double price){
                this.title=title;
                this.price=price;
        }
        public String getTitle(){
                return (title);
        }
        public double getPrice(){
                return (price);
        }
}
class MyComparator implements Comparator{
        public int compare(Object o1,Object o2){
                Book book1=(Book)o1;
                Book book2=(Book)o2;
                if(book1.getPrice() < book2.getPrice()){
                        return (-1);
                }else {
                        return (1);
                }

        }
}
public class Set {
        public static void main(String[] argu) {
                Book b1, b2, b3;
                b1 = new Book("Php", 540);
                b2 = new Book("Cpp", 430);
                b3 = new Book("Java", 620);

                TreeSet t1 = new TreeSet();                      // $$$$$$$$$$$     TreeSet      $$$$$$$$$$$ //
                t1.add(b1);
                t1.add(b2);
                t1.add(b3);

                TreeSet t=new TreeSet(new MyComparator());
                t.add(b1);
                t.add(b2);
                t.add(b3);
                Book b;
                Iterator it=t.iterator();
                while (it.hasNext()){
                        b=(Book) it.next();
                        System.out.println(b.getTitle()+"  "+b.getPrice());
                }
        }
}
 */