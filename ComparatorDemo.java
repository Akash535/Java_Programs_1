package Collection_Framework;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


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

class MyComparator implements Comparator {
    public int compare (Object o1,Object o2){
        Book book1=(Book)o1;
        Book book2=(Book)o2;
        if(book1.getPrice() < book2.getPrice())
            return (-1);
        else
            return (1);

    }
}
public class ComparatorDemo {
    public static void main(String[] argc) {
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
 